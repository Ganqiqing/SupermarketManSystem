package com.demo.pojo;

import java.util.Date;

/**
 * @author Gan
 */
public class Commodity {
    private Integer commodity_id;
    private String commodity_name;
    private Date commodity_date;
    private Integer commodity_price;
    private String commodity_priceCode;
    //多对一
    private Commodity_type commodity_type;

    public Commodity() {
    }

    public Commodity(Integer commodity_id, String commodity_name, Date commodity_date, Integer commodity_price, String commodity_priceCode, Commodity_type commodity_type) {
        this.commodity_id = commodity_id;
        this.commodity_name = commodity_name;
        this.commodity_date = commodity_date;
        this.commodity_price = commodity_price;
        this.commodity_priceCode = commodity_priceCode;
        this.commodity_type = commodity_type;
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

    public Commodity_type getCommodity_type() {
        return commodity_type;
    }

    public void setCommodity_type(Commodity_type commodity_type) {
        this.commodity_type = commodity_type;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "commodity_id=" + commodity_id +
                ", commodity_name='" + commodity_name + '\'' +
                ", commodity_date=" + commodity_date +
                ", commodity_price=" + commodity_price +
                ", commodity_priceCode='" + commodity_priceCode + '\'' +
                ", commodity_type=" + commodity_type +
                '}';
    }
}