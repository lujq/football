package com.example.spinwheel.base.dao;

import com.example.spinwheel.base.domain.Schedule20182019;
import com.example.spinwheel.base.domain.Schedule20182019Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Schedule20182019Mapper {
    long countByExample(Schedule20182019Example example);

    int deleteByExample(Schedule20182019Example example);

    int deleteByPrimaryKey(Integer odds_id);

    int insert(Schedule20182019 record);

    int insertSelective(Schedule20182019 record);

    List<Schedule20182019> selectByExample(Schedule20182019Example example);

    Schedule20182019 selectByPrimaryKey(Integer odds_id);

    int updateByExampleSelective(@Param("record") Schedule20182019 record, @Param("example") Schedule20182019Example example);

    int updateByExample(@Param("record") Schedule20182019 record, @Param("example") Schedule20182019Example example);

    int updateByPrimaryKeySelective(Schedule20182019 record);

    int updateByPrimaryKey(Schedule20182019 record);
}