package io.wangjie.drivercard.dao;

import io.wangjie.drivercard.pojo.City;
import io.wangjie.drivercard.vo.CityNode;

import java.util.List;

public interface CityMapper {
    int deleteByPrimaryKey(Integer cityId);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer cityId);

    List<CityNode> selectChildren(Integer cityId);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}