package com.demo.mapper;

import com.demo.pojo.Commodity;
import com.demo.pojo.CommodityIndex;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Gan
 */
@Mapper
public interface CommodityMapper {
    public List<Commodity> selectAllCom();

    public List<CommodityIndex> selectLay();

    public List<Commodity> selectIdAndName();

    public Commodity selPriceById(Integer commodity_id);
}
