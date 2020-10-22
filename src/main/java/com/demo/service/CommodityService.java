package com.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.demo.pojo.Commodity;

import java.util.List;

public interface CommodityService {
    public List<Commodity> selectAllCom();

    public JSONObject laySelect(int pageNum, int pageSize);

    public List<Commodity> selectIdAndName();

    public Commodity selPriceById(Integer commodity_id);
}
