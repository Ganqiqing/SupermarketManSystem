package com.demo.controller;

import com.demo.pojo.Commodity;
import com.demo.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/commodity")
public class CommodityController {
    @Autowired
    private CommodityService commodityService;

    @RequestMapping(value = "selectAll")
    @ResponseBody
    public List<Commodity> commodityList() {
        return commodityService.selectAllCom();
    }
}
