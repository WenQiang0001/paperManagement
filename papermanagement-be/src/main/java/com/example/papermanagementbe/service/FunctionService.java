package com.example.papermanagementbe.service;

import com.example.papermanagementbe.schema.TeacherSchema;
import com.example.papermanagementbe.util.BaseDtoRequest;
import com.example.papermanagementbe.util.BaseDtoResponse;

import java.util.List;

public interface FunctionService {
    //新增教师
    int addTeacher(BaseDtoRequest<TeacherSchema> teacherSchema);
    //全查教师
    List<TeacherSchema> queryTeacher(BaseDtoRequest<TeacherSchema> teacherSchema);
    //条件查询教师
    TeacherSchema queryTeacherByAccount(String account);
}
