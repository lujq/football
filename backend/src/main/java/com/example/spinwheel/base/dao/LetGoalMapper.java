package com.example.spinwheel.base.dao;

import com.example.spinwheel.base.domain.LetGoal;
import com.example.spinwheel.base.domain.LetGoalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LetGoalMapper {
    long countByExample(LetGoalExample example);

    int deleteByExample(LetGoalExample example);

    int deleteByPrimaryKey(Integer oddsID);

    int insert(LetGoal record);

    int insertSelective(LetGoal record);

    List<LetGoal> selectByExample(LetGoalExample example);

    LetGoal selectByPrimaryKey(Integer oddsID);

    int updateByExampleSelective(@Param("record") LetGoal record, @Param("example") LetGoalExample example);

    int updateByExample(@Param("record") LetGoal record, @Param("example") LetGoalExample example);

    int updateByPrimaryKeySelective(LetGoal record);

    int updateByPrimaryKey(LetGoal record);
}