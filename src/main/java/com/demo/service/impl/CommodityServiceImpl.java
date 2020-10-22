package com.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.demo.mapper.CommodityMapper;
import com.demo.pojo.Commodity;
import com.demo.pojo.CommodityIndex;
import com.demo.service.CommodityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired(required = false)
    CommodityMapper commodityMapper;

    @Override
    public List<Commodity> selectAllCom() {
        return commodityMapper.selectAllCom();
    }

    @Override
    public JSONObject laySelect(int pageNum, int pageSize) {
        JSONObject result = new JSONObject();
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<CommodityIndex> commodityList = commodityMapper.selectLay();
            PageInfo<CommodityIndex> pageInfo = new PageInfo<>(commodityList);
            result.put("code", "0");
            result.put("msg", "操作成功！");
            result.put("data", pageInfo.getList());
            result.put("count", pageInfo.getTotal());
        } catch (Exception e) {
            result.put("code", "500");
            result.put("msg", "查询异常！");
        }
        return result;
    }

    @Override
    public List<Commodity> selectIdAndName() {
        return commodityMapper.selectIdAndName();
    }

    @Override
    public Commodity selPriceById(Integer commodity_id) {
        return commodityMapper.selPriceById(commodity_id);
    }
}
