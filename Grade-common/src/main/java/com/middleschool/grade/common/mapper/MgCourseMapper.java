package com.middleschool.grade.common.mapper;

import com.middleschool.grade.common.dto.MgCourse;
import com.middleschool.grade.common.dto.MgCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgCourseMapper {
    int countByExample(MgCourseExample example);

    int deleteByExample(MgCourseExample example);

    int deleteByPrimaryKey(Long courseId);

    int insert(MgCourse record);

    int insertSelective(MgCourse record);

    List<MgCourse> selectByExample(MgCourseExample example);

    MgCourse selectByPrimaryKey(Long courseId);

    int updateByExampleSelective(@Param("record") MgCourse record, @Param("example") MgCourseExample example);

    int updateByExample(@Param("record") MgCourse record, @Param("example") MgCourseExample example);

    int updateByPrimaryKeySelective(MgCourse record);

    int updateByPrimaryKey(MgCourse record);
}