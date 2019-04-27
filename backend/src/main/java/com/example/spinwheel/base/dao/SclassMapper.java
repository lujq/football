package com.example.spinwheel.base.dao;

import com.example.spinwheel.base.domain.Sclass;
import com.example.spinwheel.base.domain.SclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SclassMapper {
    long countByExample(SclassExample example);

    int deleteByExample(SclassExample example);

    int deleteByPrimaryKey(Integer sclassID);

    int insert(Sclass record);

    int insertSelective(Sclass record);

    List<Sclass> selectByExampleWithBLOBs(SclassExample example);

    List<Sclass> selectByExample(SclassExample example);

    Sclass selectByPrimaryKey(Integer sclassID);

    int updateByExampleSelective(@Param("record") Sclass record, @Param("example") SclassExample example);

    int updateByExampleWithBLOBs(@Param("record") Sclass record, @Param("example") SclassExample example);

    int updateByExample(@Param("record") Sclass record, @Param("example") SclassExample example);

    int updateByPrimaryKeySelective(Sclass record);

    int updateByPrimaryKeyWithBLOBs(Sclass record);

    int updateByPrimaryKey(Sclass record);
}