package com.example.papermanagementbe.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.papermanagementbe.dto.LoginDto;
import com.example.papermanagementbe.err.Error;
import com.example.papermanagementbe.mapper.CodeMapper;
import com.example.papermanagementbe.mapper.ManagerMapper;
import com.example.papermanagementbe.mapper.StudentMapper;
import com.example.papermanagementbe.mapper.TeacherMapper;
import com.example.papermanagementbe.schema.ManagerSchema;
import com.example.papermanagementbe.schema.StudentSchema;
import com.example.papermanagementbe.schema.TeacherSchema;
import com.example.papermanagementbe.service.LoginService;
import com.example.papermanagementbe.util.BaseDtoRequest;
import com.example.papermanagementbe.util.BaseDtoResponse;
import com.example.papermanagementbe.util.RequestHeader;
import com.example.papermanagementbe.util.ResponseHeader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class LoginServiceImp implements LoginService {
    @Resource
    private ManagerMapper managerMapper;
    @Resource
    private StudentMapper studentMapper;
    @Resource
    private TeacherMapper teacherMapper;

    /**
     * 登录校验
     * @param loginDto
     * @return
     */
    @Override
    public BaseDtoResponse queryType(BaseDtoRequest<LoginDto> loginDto) {
        BaseDtoResponse baseDtoResponse=new BaseDtoResponse<>();
        ResponseHeader header=new ResponseHeader();
        LoginDto body = loginDto.getBody();
        RequestHeader reqheader = loginDto.getHeader();
        String type = reqheader.getType();
        String uuid = body.getUuid();
            if(type.equals(Error.MANAGER_CEODE)){
                ManagerSchema managerSchema = managerMapper.selectOne(new QueryWrapper<ManagerSchema>().eq("managerno", uuid));
                if(managerSchema!=null){
                    header.setCode(Error.SUCCESS_CODE.getCode());
                    header.setErrorMessage(Error.SUCCESS_CODE.getErrormessage());
                    baseDtoResponse.setBody(managerSchema);
                }else {
                    header.setCode(Error.NO_HUMAN_ERR.getCode());
                    header.setErrorMessage(Error.NO_HUMAN_ERR.getErrormessage());
                }
            } else if (type.equals(Error.TEACHER_CEODE)) {
                TeacherSchema teacherSchema = teacherMapper.selectOne(new QueryWrapper<TeacherSchema>().eq("teacherno", uuid));
                if(teacherSchema!=null){
                    header.setCode(Error.SUCCESS_CODE.getCode());
                    header.setErrorMessage(Error.SUCCESS_CODE.getErrormessage());
                    baseDtoResponse.setBody(teacherSchema);
                }else {
                    header.setCode(Error.NO_HUMAN_ERR.getCode());
                    header.setErrorMessage(Error.NO_HUMAN_ERR.getErrormessage());
                }
            }else {
                StudentSchema studentSchema = studentMapper.selectOne(new QueryWrapper<StudentSchema>().eq("studentno", uuid));
                if (studentSchema!=null){
                    header.setCode(Error.NO_HUMAN_ERR.getCode());
                    header.setErrorMessage(Error.NO_HUMAN_ERR.getErrormessage());
                    baseDtoResponse.setBody(studentSchema);
                }else {
                    header.setCode(Error.NO_HUMAN_ERR.getCode());
                    header.setErrorMessage(Error.NO_HUMAN_ERR.getErrormessage());
                }
            }
        baseDtoResponse.setHeader(header);
        return baseDtoResponse;
    }
}
