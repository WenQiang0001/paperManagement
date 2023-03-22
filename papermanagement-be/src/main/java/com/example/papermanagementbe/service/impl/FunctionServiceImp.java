package com.example.papermanagementbe.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.papermanagementbe.mapper.FunctionMapper;
import com.example.papermanagementbe.mapper.TeacherMapper;
import com.example.papermanagementbe.schema.TeacherSchema;
import com.example.papermanagementbe.service.FunctionService;
import com.example.papermanagementbe.util.BaseDtoRequest;
import com.example.papermanagementbe.util.NumberUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class FunctionServiceImp implements FunctionService {
    @Resource
    private TeacherMapper teacherMapper;
    @Resource
    private FunctionMapper functionMapper;

    /**
     * 新增教师
     * @param teacherSchema
     * @return
     */
    @Override
//    @Transactional(rollbackFor = Exception.class)
    public int addTeacher(BaseDtoRequest<TeacherSchema> teacherSchema) {
        TeacherSchema body = teacherSchema.getBody();
        body.setTeacherNo(NumberUtil.getId());
        return teacherMapper.insert(body);
    }

    /**
     * 全查教师
     * @param teacherSchema
     * @return
     */
    @Override
    public List<TeacherSchema> queryTeacher(BaseDtoRequest<TeacherSchema> teacherSchema) {
        return functionMapper.queryAll(teacherSchema.getBody());
    }

    /**
     * 条件查询教师
     * @param account
     * @return
     */
    @Override
    public TeacherSchema queryTeacherByAccount(String account) {
        return teacherMapper.selectOne(new QueryWrapper<TeacherSchema>().eq("TeacherAccount",account));
    }
}
