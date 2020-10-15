package com.demo.pojo;

public class Warehouse {
    private Integer commodity_id;
    private Integer number;
    //一对一
    private Commodity commodity;

    public Warehouse() {
    }

    public Warehouse(Integer commodity_id, Integer number, Commodity commodity) {
        this.commodity_id = commodity_id;
        this.number = number;
        this.commodity = commodity;
    }

    public Integer getCommodity_id() {
        return commodity_id;
    }

    public void setCommodity_id(Integer commodity_id) {
        this.commodity_id = commodity_id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "commodity_id=" + commodity_id +
                ", number=" + number +
                ", commodity=" + commodity +
                '}';
    }
}
