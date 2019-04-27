package com.example.spinwheel.base.dao;

import com.example.spinwheel.base.domain.TotalScoreDetail;
import com.example.spinwheel.base.domain.TotalScoreDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TotalScoreDetailMapper {
    long countByExample(TotalScoreDetailExample example);

    int deleteByExample(TotalScoreDetailExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(TotalScoreDetail record);

    int insertSelective(TotalScoreDetail record);

    List<TotalScoreDetail> selectByExample(TotalScoreDetailExample example);

    TotalScoreDetail selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("record") TotalScoreDetail record, @Param("example") TotalScoreDetailExample example);

    int updateByExample(@Param("record") TotalScoreDetail record, @Param("example") TotalScoreDetailExample example);

    int updateByPrimaryKeySelective(TotalScoreDetail record);

    int updateByPrimaryKey(TotalScoreDetail record);
}