package com.example.papermanagementbe.mapper;

import com.example.papermanagementbe.schema.TeacherSchema;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FunctionMapper {
    List<TeacherSchema> queryAll(TeacherSchema teacherSchema);

}
