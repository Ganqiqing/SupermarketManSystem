package com.demo.controller;

import com.demo.pojo.Commodity;
import com.demo.service.CommodityService;
import com.demo.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

}
