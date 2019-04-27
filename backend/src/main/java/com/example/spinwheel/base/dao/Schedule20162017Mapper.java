package com.example.spinwheel.base.dao;

import com.example.spinwheel.base.domain.Schedule20162017;
import com.example.spinwheel.base.domain.Schedule20162017Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Schedule20162017Mapper {
    long countByExample(Schedule20162017Example example);

    int deleteByExample(Schedule20162017Example example);

    int deleteByPrimaryKey(Integer odds_id);

    int insert(Schedule20162017 record);

    int insertSelective(Schedule20162017 record);

    List<Schedule20162017> selectByExample(Schedule20162017Example example);

    Schedule20162017 selectByPrimaryKey(Integer odds_id);

    int updateByExampleSelective(@Param("record") Schedule20162017 record, @Param("example") Schedule20162017Example example);

    int updateByExample(@Param("record") Schedule20162017 record, @Param("example") Schedule20162017Example example);

    int updateByPrimaryKeySelective(Schedule20162017 record);

    int updateByPrimaryKey(Schedule20162017 record);
}