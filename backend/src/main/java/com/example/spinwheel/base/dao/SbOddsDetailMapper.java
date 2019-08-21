package com.example.spinwheel.base.dao;

import com.example.spinwheel.base.domain.SbOddsDetail;
import com.example.spinwheel.base.domain.SbOddsDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SbOddsDetailMapper {
    long countByExample(SbOddsDetailExample example);

    int deleteByExample(SbOddsDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SbOddsDetail record);

    int insertSelective(SbOddsDetail record);

    List<SbOddsDetail> selectByExample(SbOddsDetailExample example);

    SbOddsDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SbOddsDetail record, @Param("example") SbOddsDetailExample example);

    int updateByExample(@Param("record") SbOddsDetail record, @Param("example") SbOddsDetailExample example);

    int updateByPrimaryKeySelective(SbOddsDetail record);

    int updateByPrimaryKey(SbOddsDetail record);
}