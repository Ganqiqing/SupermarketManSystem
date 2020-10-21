package com.demo.controller;

import com.demo.pojo.Staff;
import com.demo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/main")
public class MainController {
    @Autowired
    private StaffService staffService;

    /*
     * 下线修改状态码
     * */
    @RequestMapping(value = "/shutdown")
    @ResponseBody
    public String registering(Staff staff) {
        String result = "{\"result\":\"error\"}";
        if (staffService.ShutDown(staff)) {
            result = "{\"result\":\"success\"}";
        }
        return result;
    }

    /*
     * 删除用户信息
     * */
    @RequestMapping(value = "/deleteById")
    @ResponseBody
    public String deleteById(Staff staff) {
        String result = "{\"result\":\"error\"}";
        if (staffService.deleteById(staff)) {
            result = "{\"result\":\"success\"}";
        }
        return result;
    }

    /*
     * 修改用户信息
     * */
    @RequestMapping(value = "/updateById")
    @ResponseBody
    public String updateById(Staff staff) {
        String result = "{\"result\":\"error\"}";
        if (staffService.updateById(staff)) {
            result = "{\"result\":\"success\"}";
        }
        return result;
    }

    @RequestMapping(value = "/selectById")
    @ResponseBody
    public Staff selectById(Integer staff_id) {
        return staffService.selectById(staff_id);
    }
}
