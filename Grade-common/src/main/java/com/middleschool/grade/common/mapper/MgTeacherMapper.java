package com.middleschool.grade.common.mapper;

import com.middleschool.grade.common.dto.MgTeacher;
import com.middleschool.grade.common.dto.MgTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgTeacherMapper {
    int countByExample(MgTeacherExample example);

    int deleteByExample(MgTeacherExample example);

    int deleteByPrimaryKey(Long teacherNum);

    int insert(MgTeacher record);

    int insertSelective(MgTeacher record);

    List<MgTeacher> selectByExample(MgTeacherExample example);

    MgTeacher selectByPrimaryKey(Long teacherNum);

    int updateByExampleSelective(@Param("record") MgTeacher record, @Param("example") MgTeacherExample example);

    int updateByExample(@Param("record") MgTeacher record, @Param("example") MgTeacherExample example);

    int updateByPrimaryKeySelective(MgTeacher record);

    int updateByPrimaryKey(MgTeacher record);
}