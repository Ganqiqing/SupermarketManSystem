package com.demo.controller;

import com.demo.pojo.Staff;
import com.demo.service.StaffService;
import com.demo.tools.Constatns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author Gan
 */
@Controller
@RequestMapping(value = "/staff")
public class StaffController {
    @Autowired
    private StaffService staffService;

    /*
     * 从session中取出登录人员的信息
     * */
    @RequestMapping(value = "/findById")
    @ResponseBody
    public Staff findOne(HttpSession session) {
        return (Staff) session.getAttribute(Constatns.STAFF_SESSION);
    }


    /*
     * 查询所有工作人员信息
     * */
    @RequestMapping(value = "/findAll")
    @ResponseBody
    public List<Staff> findAll() {
        return staffService.findAll();
    }

}