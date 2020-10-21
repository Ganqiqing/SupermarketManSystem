package com.demo.service;

import com.demo.pojo.Staff;

import java.util.List;

public interface StaffService {
    public boolean addStaff(Staff staff);

    public List<Staff> findAll();

    public Staff selectById(Integer staff_id);

    public Staff loginStaff(Staff staff);

    public boolean deleteById(Staff staff);

    public boolean updateById(Staff staff);

    public boolean UpStaState(Staff staff);

    public boolean ShutDown(Staff staff);
}
