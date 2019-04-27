package com.example.spinwheel.base.dao;

import com.example.spinwheel.base.domain.TotalScore;
import com.example.spinwheel.base.domain.TotalScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TotalScoreMapper {
    long countByExample(TotalScoreExample example);

    int deleteByExample(TotalScoreExample example);

    int deleteByPrimaryKey(Integer oddsID);

    int insert(TotalScore record);

    int insertSelective(TotalScore record);

    List<TotalScore> selectByExample(TotalScoreExample example);

    TotalScore selectByPrimaryKey(Integer oddsID);

    int updateByExampleSelective(@Param("record") TotalScore record, @Param("example") TotalScoreExample example);

    int updateByExample(@Param("record") TotalScore record, @Param("example") TotalScoreExample example);

    int updateByPrimaryKeySelective(TotalScore record);

    int updateByPrimaryKey(TotalScore record);
}