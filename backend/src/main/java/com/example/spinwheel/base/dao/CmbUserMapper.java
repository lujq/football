package com.example.spinwheel.base.dao;

import com.example.spinwheel.base.domain.CmbUser;
import com.example.spinwheel.base.domain.CmbUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmbUserMapper {
    long countByExample(CmbUserExample example);

    int deleteByExample(CmbUserExample example);

    int deleteByPrimaryKey(Long ID);

    int insert(CmbUser record);

    int insertSelective(CmbUser record);

    List<CmbUser> selectByExample(CmbUserExample example);

    CmbUser selectByPrimaryKey(Long ID);

    int updateByExampleSelective(@Param("record") CmbUser record, @Param("example") CmbUserExample example);

    int updateByExample(@Param("record") CmbUser record, @Param("example") CmbUserExample example);

    int updateByPrimaryKeySelective(CmbUser record);

    int updateByPrimaryKey(CmbUser record);
}