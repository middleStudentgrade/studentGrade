package com.middleschool.grade.common.dto;

public class MgCourse {
    private Long courseId;

    private String name;

    private Long teacherNum;

    private Double credit;

    private Integer classHours;

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(Long teacherNum) {
        this.teacherNum = teacherNum;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Integer getClassHours() {
        return classHours;
    }

    public void setClassHours(Integer classHours) {
        this.classHours = classHours;
    }
}