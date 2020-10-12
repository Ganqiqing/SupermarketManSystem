package com.demo.controller;

import com.demo.pojo.Staff;
import com.demo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/super")
public class IndexController {
    @Autowired
    private StaffService staffService;

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/toLogin")
    public String toLogin() {
        return "login";
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
            return result;
        } else {
            return result;
        }
    }
}
