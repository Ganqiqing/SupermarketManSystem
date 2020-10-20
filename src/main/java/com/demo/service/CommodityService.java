package com.demo.service;

import com.demo.pojo.Commodity;

import java.util.List;

public interface CommodityService {
    public List<Commodity> selectAllCom();

    public List<Commodity> selectIdAndName();

    public Commodity selPriceById(Integer commodity_id);
}
