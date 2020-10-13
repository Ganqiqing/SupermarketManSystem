package com.demo.pojo;

public class Staff {
    private Integer staff_id;
    private String account;
    private String password;
    private String staff_name;
    private String staff_sex;
    private Integer staff_age;
    private Integer wages;
    private String phone;
    private Integer limit;
    private Integer state;

    public Staff() {
    }

    public Staff(Integer staff_id, String account, String password, String staff_name, String staff_sex, Integer staff_age, Integer wages, String phone, Integer limit, Integer state) {
        this.staff_id = staff_id;
        this.account = account;
        this.password = password;
        this.staff_name = staff_name;
        this.staff_sex = staff_sex;
        this.staff_age = staff_age;
        this.wages = wages;
        this.phone = phone;
        this.limit = limit;
        this.state = state;
    }

    public Integer getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(Integer staff_id) {
        this.staff_id = staff_id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getStaff_sex() {
        return staff_sex;
    }

    public void setStaff_sex(String staff_sex) {
        this.staff_sex = staff_sex;
    }

    public Integer getStaff_age() {
        return staff_age;
    }

    public void setStaff_age(Integer staff_age) {
        this.staff_age = staff_age;
    }

    public Integer getWages() {
        return wages;
    }

    public void setWages(Integer wages) {
        this.wages = wages;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staff_id=" + staff_id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", staff_name='" + staff_name + '\'' +
                ", staff_sex='" + staff_sex + '\'' +
                ", staff_age=" + staff_age +
                ", wages=" + wages +
                ", phone='" + phone + '\'' +
                ", limit=" + limit +
                ", state=" + state +
                '}';
    }
}
