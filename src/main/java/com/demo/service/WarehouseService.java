package com.demo.service;

import com.demo.pojo.Warehouse;

import java.util.List;

public interface WarehouseService {
    public List<Warehouse> findAll();

    public boolean addNum(Warehouse warehouse);

    public boolean reduceNum(Warehouse warehouse);
}
