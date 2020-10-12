package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/super")
public class IndexController {
    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping(value = "/toRegister")
    public String toRegister(){
        return "register";
    }

    @RequestMapping(value = "/register")
    public String register(){
        return null;
    }
}
