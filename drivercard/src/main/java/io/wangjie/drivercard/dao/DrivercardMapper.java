package io.wangjie.drivercard.dao;

import com.github.pagehelper.Page;
import io.wangjie.drivercard.pojo.Drivercard;

public interface DrivercardMapper {
    int deleteByPrimaryKey(Integer cardId);

    int insert(Drivercard record);

    int insertSelective(Drivercard record);

    Drivercard selectByPrimaryKey(Integer cardId);

    Page<Drivercard> selectWithPageAndName(String drivername);

    int updateByPrimaryKeySelective(Drivercard record);

    int updateByPrimaryKey(Drivercard record);
}