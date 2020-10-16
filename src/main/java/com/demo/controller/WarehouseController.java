package com.demo.controller;

import com.demo.pojo.Warehouse;
import com.demo.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Gan
 */
@Controller
@RequestMapping(value = "/warehouse")
public class WarehouseController {
    @Autowired
    private WarehouseService warehouseService;

    @RequestMapping(value = "/warehouse")
    public String warehouse() {
        return "warehouse";
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findAll() {
        Map<String, Object> map = new HashMap<>();
        map.put("data", warehouseService.findAll());
        return map;
    }

    @RequestMapping(value = "/selectAll", method = RequestMethod.POST)
    @ResponseBody
    public List<Warehouse> selectAll() {
        return warehouseService.findAll();
    }

}
