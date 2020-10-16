package com.demo.mapper;

import com.demo.pojo.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Gan
 */
@Mapper
public interface StaffMapper {
    public boolean addStaff(Staff staff);

    @Select("select * from staff")
    public List<Staff> findAll();

    public Staff loginStaff(Staff staff);

    public boolean UpStaState(Staff staff);
}
