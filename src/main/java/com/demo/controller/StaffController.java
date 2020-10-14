package com.demo.controller;

import com.demo.pojo.Staff;
import com.demo.tools.Constatns;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/staff")
public class StaffController {
    @RequestMapping(value = "/findById")
    @ResponseBody
    public Staff selectOne(HttpSession session) {
        return (Staff) session.getAttribute(Constatns.STAFF_SESSION);
    }
}