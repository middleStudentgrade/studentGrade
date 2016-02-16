package com.middleschool.grade.common.dto;

public class MgTeacher {
    private Long teacherNum;

    private String name;

    private String sex;

    private String department;

    public Long getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(Long teacherNum) {
        this.teacherNum = teacherNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }
}