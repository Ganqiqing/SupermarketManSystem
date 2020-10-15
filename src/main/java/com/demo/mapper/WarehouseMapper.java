package com.demo.mapper;

import com.demo.pojo.Warehouse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WarehouseMapper {
    public List<Warehouse> findAll();
}
