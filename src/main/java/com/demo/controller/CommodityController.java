package com.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.demo.pojo.Commodity;
import com.demo.service.CommodityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Gan
 */
@Controller
@RequestMapping("/commodity")
public class CommodityController {
    @Autowired
    private CommodityService commodityService;

    @RequestMapping(value = "/selectAll")
    public String selectAll(Model model, @RequestParam(value = "pageStart", defaultValue = "0") int pageStart, @RequestParam(value = "pageSize", defaultValue = "5") int pageSize) {
        PageHelper.startPage(pageStart, pageSize);
        List<Commodity> commodityList = commodityService.selectAllCom();
        PageInfo<Commodity> pageInfo = new PageInfo<>(commodityList);
        model.addAttribute("page", pageInfo);
        return "commodity";
    }

    @RequestMapping(value = "/test")
    public String testIndex(){
        return "TestIndex";
    }

    @RequestMapping(value = "/laySelect")
    @ResponseBody
    public JSONObject laySelect(@RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum, @RequestParam(value = "pageSize", required = false, defaultValue = "5") int pageSize) {
        return commodityService.laySelect(pageNum, pageSize);
    }
}
