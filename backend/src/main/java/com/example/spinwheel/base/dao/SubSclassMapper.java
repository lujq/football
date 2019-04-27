package com.example.spinwheel.base.dao;

import com.example.spinwheel.base.domain.SubSclass;
import com.example.spinwheel.base.domain.SubSclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubSclassMapper {
    long countByExample(SubSclassExample example);

    int deleteByExample(SubSclassExample example);

    int deleteByPrimaryKey(Integer subSclassID);

    int insert(SubSclass record);

    int insertSelective(SubSclass record);

    List<SubSclass> selectByExample(SubSclassExample example);

    SubSclass selectByPrimaryKey(Integer subSclassID);

    int updateByExampleSelective(@Param("record") SubSclass record, @Param("example") SubSclassExample example);

    int updateByExample(@Param("record") SubSclass record, @Param("example") SubSclassExample example);

    int updateByPrimaryKeySelective(SubSclass record);

    int updateByPrimaryKey(SubSclass record);
}