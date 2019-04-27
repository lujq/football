package com.example.spinwheel.base.dao;

import com.example.spinwheel.base.domain.Schedule2016;
import com.example.spinwheel.base.domain.Schedule2016Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Schedule2016Mapper {
    long countByExample(Schedule2016Example example);

    int deleteByExample(Schedule2016Example example);

    int deleteByPrimaryKey(Integer odds_id);

    int insert(Schedule2016 record);

    int insertSelective(Schedule2016 record);

    List<Schedule2016> selectByExample(Schedule2016Example example);

    Schedule2016 selectByPrimaryKey(Integer odds_id);

    int updateByExampleSelective(@Param("record") Schedule2016 record, @Param("example") Schedule2016Example example);

    int updateByExample(@Param("record") Schedule2016 record, @Param("example") Schedule2016Example example);

    int updateByPrimaryKeySelective(Schedule2016 record);

    int updateByPrimaryKey(Schedule2016 record);
}