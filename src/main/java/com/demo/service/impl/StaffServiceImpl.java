package com.demo.service.impl;

import com.demo.mapper.StaffMapper;
import com.demo.pojo.Staff;
import com.demo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired(required = false)
    private StaffMapper staffMapper;

    @Override
    public boolean addStaff(Staff staff) {
        return staffMapper.addStaff(staff);
    }

    @Override
    public List<Staff> findAll() {
        return staffMapper.findAll();
    }

    @Override
    public Staff selectById(Integer staff_id) {
        return staffMapper.selectById(staff_id);
    }

    @Override
    public Staff loginStaff(Staff staff) {
        return staffMapper.loginStaff(staff);
    }

    @Override
    public boolean deleteById(Staff staff) {
        return staffMapper.deleteById(staff);
    }

    @Override
    public boolean updateById(Staff staff) {
        return staffMapper.updateById(staff);
    }

    @Override
    public boolean UpStaState(Staff staff) {
        return staffMapper.UpStaState(staff);
    }

    @Override
    public boolean ShutDown(Staff staff) {
        return staffMapper.ShutDown(staff);
    }

}
