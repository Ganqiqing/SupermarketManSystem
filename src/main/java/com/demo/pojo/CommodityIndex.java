package com.demo.pojo;

import java.util.Date;

public class CommodityIndex {
    private Integer commodity_id;
    private String commodity_name;
    private Date commodity_date;
    private Integer commodity_price;
    private String commodity_priceCode;
    private Integer commodity_typeCode;
    private String commodity_type;

    public CommodityIndex() {
    }

    public Integer getCommodity_id() {
        return commodity_id;
    }

    public void setCommodity_id(Integer commodity_id) {
        this.commodity_id = commodity_id;
    }

    public String getCommodity_name() {
        return commodity_name;
    }

    public void setCommodity_name(String commodity_name) {
        this.commodity_name = commodity_name;
    }

    public Date getCommodity_date() {
        return commodity_date;
    }

    public void setCommodity_date(Date commodity_date) {
        this.commodity_date = commodity_date;
    }

    public Integer getCommodity_price() {
        return commodity_price;
    }

    public void setCommodity_price(Integer commodity_price) {
        this.commodity_price = commodity_price;
    }

    public String getCommodity_priceCode() {
        return commodity_priceCode;
    }

    public void setCommodity_priceCode(String commodity_priceCode) {
        this.commodity_priceCode = commodity_priceCode;
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

    @Override
    public String toString() {
        return "CommodityIndex{" +
                "commodity_id=" + commodity_id +
                ", commodity_name='" + commodity_name + '\'' +
                ", commodity_date=" + commodity_date +
                ", commodity_price=" + commodity_price +
                ", commodity_priceCode='" + commodity_priceCode + '\'' +
                ", commodity_typeCode=" + commodity_typeCode +
                ", commodity_type='" + commodity_type + '\'' +
                '}';
    }
}
