package com.demo.mapper;

import com.demo.pojo.Staff;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StaffMapper {
    public boolean addStaff(Staff staff);

    public Staff loginStaff(Staff staff);

    public boolean UpStaState(Staff staff);
}
