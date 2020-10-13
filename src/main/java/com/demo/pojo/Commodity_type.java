package com.demo.pojo;

import java.util.List;

public class Commodity_type {
    private Integer commodity_typeCode;
    private String commodity_type;
    //一对多
    private List<Commodity> commodityList;

    public Commodity_type() {
    }

    public Commodity_type(Integer commodity_typeCode, String commodity_type, List<Commodity> commodityList) {
        this.commodity_typeCode = commodity_typeCode;
        this.commodity_type = commodity_type;
        this.commodityList = commodityList;
    }

    public Integer getCommodity_typeCode() {
        return commodity_typeCode;
    }

    public void setCommodity_typeCode(Integer commodity_typeCode) {
        this.commodity_typeCode = commodity_typeCode;
    }

    public String getCommodity_type() {
        return commodity_type;
    }

    public void setCommodity_type(String commodity_type) {
        this.commodity_type = commodity_type;
    }

    public List<Commodity> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<Commodity> commodityList) {
        this.commodityList = commodityList;
    }

    @Override
    public String toString() {
        return "Commodity_type{" +
                "commodity_typeCode=" + commodity_typeCode +
                ", commodity_type='" + commodity_type + '\'' +
                ", commodityList=" + commodityList +
                '}';
    }
}
