package com.example.spinwheel.base.dao;

import com.example.spinwheel.base.domain.Schedule2017;
import com.example.spinwheel.base.domain.Schedule2017Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Schedule2017Mapper {
    long countByExample(Schedule2017Example example);

    int deleteByExample(Schedule2017Example example);

    int deleteByPrimaryKey(Integer odds_id);

    int insert(Schedule2017 record);

    int insertSelective(Schedule2017 record);

    List<Schedule2017> selectByExample(Schedule2017Example example);

    Schedule2017 selectByPrimaryKey(Integer odds_id);

    int updateByExampleSelective(@Param("record") Schedule2017 record, @Param("example") Schedule2017Example example);

    int updateByExample(@Param("record") Schedule2017 record, @Param("example") Schedule2017Example example);

    int updateByPrimaryKeySelective(Schedule2017 record);

    int updateByPrimaryKey(Schedule2017 record);
}