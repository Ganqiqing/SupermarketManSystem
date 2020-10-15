package com.demo.service.impl;

import com.demo.mapper.WarehouseMapper;
import com.demo.pojo.Warehouse;
import com.demo.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {
    @Autowired(required = false)
    private WarehouseMapper warehouseMapper;

    @Override
    public List<Warehouse> findAll() {
        return warehouseMapper.findAll();
    }
}
