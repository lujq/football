package com.example.spinwheel.base.dao;

import com.example.spinwheel.base.domain.Schedule20172018;
import com.example.spinwheel.base.domain.Schedule20172018Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Schedule20172018Mapper {
    long countByExample(Schedule20172018Example example);

    int deleteByExample(Schedule20172018Example example);

    int deleteByPrimaryKey(Integer odds_id);

    int insert(Schedule20172018 record);

    int insertSelective(Schedule20172018 record);

    List<Schedule20172018> selectByExample(Schedule20172018Example example);

    Schedule20172018 selectByPrimaryKey(Integer odds_id);

    int updateByExampleSelective(@Param("record") Schedule20172018 record, @Param("example") Schedule20172018Example example);

    int updateByExample(@Param("record") Schedule20172018 record, @Param("example") Schedule20172018Example example);

    int updateByPrimaryKeySelective(Schedule20172018 record);

    int updateByPrimaryKey(Schedule20172018 record);
}