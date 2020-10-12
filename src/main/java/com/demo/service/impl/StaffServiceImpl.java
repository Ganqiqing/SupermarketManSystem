package com.demo.service.impl;

import com.demo.mapper.StaffMapper;
import com.demo.pojo.Staff;
import com.demo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired(required = false)
    private StaffMapper staffMapper;

    @Override
    public boolean addStaff(Staff staff) {
        return staffMapper.addStaff(staff);
    }
}
