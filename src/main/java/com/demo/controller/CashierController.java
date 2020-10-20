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

@Controller
@RequestMapping(value = "/cashier")
public class CashierController {
    @Autowired
    private CommodityService commodityService;

    @Autowired
    private WarehouseService warehouseService;

    @RequestMapping(value = "/index")
    public String index(Model model) {
        List<Commodity> commodityList = commodityService.selectIdAndName();
        model.addAttribute("commodityList", commodityList);
        return "cashier";
    }

    @RequestMapping(value = "/selectPrice")
    @ResponseBody
    public Commodity SelPriceById(Integer commodity_id) {
        return commodityService.selPriceById(commodity_id);
    }

    @RequestMapping(value = "/sell")
    @ResponseBody
    public String Sell(Warehouse warehouse) {
        String result = "{\"result\":\"error\"}";
        if (warehouseService.reduceNum(warehouse)) {
            result = "{\"result\":\"success\"}";
        }
        return result;
    }
}
