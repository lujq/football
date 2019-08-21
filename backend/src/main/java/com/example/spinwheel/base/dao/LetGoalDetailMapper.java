package com.example.spinwheel.base.dao;

import com.example.spinwheel.base.domain.LetGoalDetail;
import com.example.spinwheel.base.domain.LetGoalDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LetGoalDetailMapper {
    long countByExample(LetGoalDetailExample example);

    int deleteByExample(LetGoalDetailExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(LetGoalDetail record);

    int insertSelective(LetGoalDetail record);

    List<LetGoalDetail> selectByExample(LetGoalDetailExample example);

    LetGoalDetail selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("record") LetGoalDetail record, @Param("example") LetGoalDetailExample example);

    int updateByExample(@Param("record") LetGoalDetail record, @Param("example") LetGoalDetailExample example);

    int updateByPrimaryKeySelective(LetGoalDetail record);

    int updateByPrimaryKey(LetGoalDetail record);
}