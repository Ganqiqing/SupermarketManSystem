package com.demo.service;

import com.demo.pojo.Staff;

import java.util.List;

public interface StaffService {
    public boolean addStaff(Staff staff);

    public Staff loginStaff(Staff staff);

    public boolean UpStaState(Staff staff);
}
