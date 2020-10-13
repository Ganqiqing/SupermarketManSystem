package com.demo.service.impl;

import com.demo.mapper.CommodityMapper;
import com.demo.pojo.Commodity;
import com.demo.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired(required = false)
    CommodityMapper commodityMapper;

    @Override
    public List<Commodity> selectAllCom() {
        return commodityMapper.selectAllCom();
    }
}
