package com.example.spinwheel.base.dao;

import com.example.spinwheel.base.domain.Schedule2018;
import com.example.spinwheel.base.domain.Schedule2018Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Schedule2018Mapper {
    long countByExample(Schedule2018Example example);

    int deleteByExample(Schedule2018Example example);

    int deleteByPrimaryKey(Integer odds_id);

    int insert(Schedule2018 record);

    int insertSelective(Schedule2018 record);

    List<Schedule2018> selectByExample(Schedule2018Example example);

    Schedule2018 selectByPrimaryKey(Integer odds_id);

    int updateByExampleSelective(@Param("record") Schedule2018 record, @Param("example") Schedule2018Example example);

    int updateByExample(@Param("record") Schedule2018 record, @Param("example") Schedule2018Example example);

    int updateByPrimaryKeySelective(Schedule2018 record);

    int updateByPrimaryKey(Schedule2018 record);
}