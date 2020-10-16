package com.demo.mapper;

import com.demo.pojo.Commodity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Gan
 */
@Mapper
public interface CommodityMapper {
    public List<Commodity> selectAllCom();

    public List<Commodity> selectIdAndName();
}
