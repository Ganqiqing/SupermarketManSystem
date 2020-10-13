package com.demo.controller;

import com.demo.pojo.Staff;
import com.demo.service.StaffService;
import com.demo.tools.Constatns;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/super")
public class IndexController {
    @Autowired
    private StaffService staffService;

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/main")
    public String main(HttpSession session) {
        if (session.getAttribute(Constatns.STAFF_SESSION) == null) {
            return "redirect:/super/toLogin";
        }
        return "main";
    }

    @RequestMapping(value = "/toLogin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/noPermission")
    @ResponseBody
    public String noPermission() {
        return "noPermission";
    }

    @RequestMapping(value = "/doLogin")
    public String doLogin(Staff staff, HttpSession session, HttpServletRequest request) {
        Staff staff1 = staffService.loginStaff(staff);
        if (staff1 != null && staff1.getState() == 0) {
            session.setAttribute(Constatns.STAFF_SESSION, staff1);
            staff1.setState(1);
            staffService.UpStaState(staff1);
            return "redirect:/super/main";
        } else if (staff1 != null && staff1.getState() == 1) {
            request.setAttribute("info", "账号已登陆");
            return "login";
        } else {
            request.setAttribute("info", "账号密码错误");
            return "login";
        }
    }

    @RequestMapping(value = "/toRegister")
    public String toRegister() {
        return "register";
    }

    @RequestMapping(value = "/registering")
    @ResponseBody
    public String registering(Staff staff) {
        String result = "{\"result\":\"error\"}";
        if (staffService.addStaff(staff)) {
            result = "{\"result\":\"success\"}";
        }
        return result;
    }


    @RequestMapping("/cancellation")
    public String cancellation() {
        //创建一个shiro的subject对象
        Subject subject = SecurityUtils.getSubject();
        //调用退出方法用于清空登录时的缓存
        subject.logout();
        return "redirect:/super/index";
    }
}
