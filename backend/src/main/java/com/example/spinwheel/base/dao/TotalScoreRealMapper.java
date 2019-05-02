package com.example.spinwheel.base.dao;

import com.example.spinwheel.base.domain.TotalScoreReal;
import com.example.spinwheel.base.domain.TotalScoreRealExample;
import java.util.List;

import com.example.spinwheel.base.dto.CommonListDto;
import org.apache.ibatis.annotations.Param;

public interface TotalScoreRealMapper {
    long countByExample(TotalScoreRealExample example);

    int deleteByExample(TotalScoreRealExample example);

    int deleteByPrimaryKey(Integer odds_id);

    int insert(TotalScoreReal record);

    int insertSelective(TotalScoreReal record);

    List<TotalScoreReal> selectByExample(TotalScoreRealExample example);

    TotalScoreReal selectByPrimaryKey(Integer odds_id);

    int updateByExampleSelective(@Param("record") TotalScoreReal record, @Param("example") TotalScoreRealExample example);

    int updateByExample(@Param("record") TotalScoreReal record, @Param("example") TotalScoreRealExample example);

    int updateByPrimaryKeySelective(TotalScoreReal record);

    int updateByPrimaryKey(TotalScoreReal record);

    List<Integer> selectClassId();

    List<CommonListDto> selectSeasons();

    List<Integer> selectHomeHalfScores();

    List<Integer> selectGuestHalfScores();

    List<Float> selectFirstGoals();

    List<Float> selectGoals();

}