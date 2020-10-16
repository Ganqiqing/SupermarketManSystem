package com.demo.controller;

import com.demo.pojo.Commodity;
import com.demo.pojo.Warehouse;
import com.demo.service.CommodityService;
import com.demo.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Gan
 */
@Controller
@RequestMapping(value = "/purchase")
public class PurchaseController {
    @Autowired
    private WarehouseService warehouseService;

    @Autowired
    private CommodityService commodityService;

    @RequestMapping(value = "/index")
    public String index(Model model) {
        List<Commodity> commodityList = commodityService.selectIdAndName();
        model.addAttribute("commodityList", commodityList);
        return "purchase";
    }

    @RequestMapping(value = "addNum")
    @ResponseBody
    public String addNum(Warehouse warehouse){
        System.out.println(warehouse.getNumber());
        String result = "{\"result\":\"error\"}";
        if (warehouseService.addNum(warehouse)) {
            result = "{\"result\":\"success\"}";
        }
        return result;
    }

}
