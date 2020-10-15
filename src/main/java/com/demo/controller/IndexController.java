package com.demo.controller;

import com.demo.pojo.Staff;
import com.demo.service.StaffService;
import com.demo.tools.Constatns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    /*
     * 登录账号(判断session中有无用户)
     * 根据不同权限去往不同页面
     * 跳转好需要修改
     * */
    @RequestMapping(value = "/main")
    public String main(HttpSession session) {
        Staff staff = (Staff) session.getAttribute(Constatns.STAFF_SESSION);
        if (staff != null) {
            switch (staff.getLimit()) {
                case 1:
                    return "main";
                case 2:
                    return "cashier";
                case 3:
                    return "purchase";
                case 4:
                    return "ordinary";
            }
        }
        return "redirect:/super/toLogin";
    }

    /*
     * 前往登录页面
     * */
    @RequestMapping(value = "/toLogin")
    public String toLogin() {
        return "login";
    }

    /*
     * 没有权限的页面（现在尚未关联）
     * */
    @RequestMapping("/noPermission")
    @ResponseBody
    public String noPermission() {
        return "noPermission";
    }

    /*
     * 实现用户登录，访问数据库并判断
     * */
    @RequestMapping(value = "/doLogin")
    public String doLogin(Staff staff, HttpSession session, HttpServletRequest request) {
        Staff staff1 = staffService.loginStaff(staff);
        if (staff1 != null && staff1.getState() == 0) {
            /*
             * 判断用户状态 为0是未登录，1为登录
             * 状态为0时可登录，1不可以
             * */
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

    /*
     * 转向注册页面
     * */
    @RequestMapping(value = "/toRegister")
    public String toRegister() {
        return "register";
    }

    /*
     * 注册功能
     * */
    @RequestMapping(value = "/registering")
    @ResponseBody
    public String registering(Staff staff) {
        String result = "{\"result\":\"error\"}";
        if (staffService.addStaff(staff)) {
            result = "{\"result\":\"success\"}";
        }
        return result;
    }

}
