package com.example.papermanagementbe.controller;

import com.example.papermanagementbe.dto.LoginDto;
import com.example.papermanagementbe.err.Error;
import com.example.papermanagementbe.schema.StudentSchema;
import com.example.papermanagementbe.schema.TeacherSchema;
import com.example.papermanagementbe.service.FunctionService;
import com.example.papermanagementbe.util.BaseDtoRequest;
import com.example.papermanagementbe.util.BaseDtoResponse;
import com.example.papermanagementbe.util.ResponseHeader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/functionIndex")
public class FunctionController {
    @Resource
    private FunctionService functionService;

    /**
     * 新增教师
     * @param teacher
     * @return
     */
    @PostMapping("/addTeacher")
    public BaseDtoResponse addTeacher(@RequestBody BaseDtoRequest<TeacherSchema> teacher) {
        ResponseHeader header = new ResponseHeader();
        BaseDtoResponse baseDtoResponse = new BaseDtoResponse<>();
        TeacherSchema body = teacher.getBody();
        try {
            if(functionService.queryTeacherByAccount(body.getTeacherAccount())!=null){
                header.setCode(Error.REPEAT_CODE.getCode());
                header.setErrorMessage(Error.REPEAT_CODE.getErrormessage());
                baseDtoResponse.setHeader(header);
                return baseDtoResponse;
            }
            if(functionService.addTeacher(teacher)>0){
                header.setCode(Error.SUCCESS_CODE.getCode());
                header.setErrorMessage(Error.SUCCESS_CODE.getErrormessage());
            }
        } catch (Exception e) {
            header.setErrorMessage(Error.FAILD_CODE.getErrormessage());
            header.setCode(Error.FAILD_CODE.getCode());
            log.error(e.getMessage());
        }
        baseDtoResponse.setHeader(header);
        return baseDtoResponse;
    }

    /**
     * 全查教师
     * @param teacher
     * @return
     */
    @PostMapping("/queryTeacher")
    public BaseDtoResponse<TeacherSchema> queryTeacher(@RequestBody BaseDtoRequest<TeacherSchema> teacher) {
        ResponseHeader header = new ResponseHeader();
        BaseDtoResponse baseDtoResponse = new BaseDtoResponse<>();
        try {
            List<TeacherSchema> list= functionService.queryTeacher(teacher);
            header.setCode(Error.SUCCESS_CODE.getCode());
            baseDtoResponse.setBody(list);
        } catch (Exception e) {
            header.setErrorMessage(Error.FAILD_CODE.getErrormessage());
            header.setCode(Error.FAILD_CODE.getCode());
            log.error(e.getMessage());
        }
        baseDtoResponse.setHeader(header);
        return baseDtoResponse;
    }

    /**
     * 条件查询教师
     * @param teacher
     * @return
     */
    @PostMapping("/queryTeacherByAccount")
    public BaseDtoResponse<TeacherSchema> queryTeacherByAccount(@RequestBody BaseDtoRequest<TeacherSchema> teacher) {
        ResponseHeader header = new ResponseHeader();
        BaseDtoResponse baseDtoResponse = new BaseDtoResponse<>();
        try {
            TeacherSchema teacherSchema= functionService.queryTeacherByAccount(teacher.getBody().getTeacherAccount());
            baseDtoResponse.setBody(teacherSchema);
            header.setCode(Error.SUCCESS_CODE.getCode());
        } catch (Exception e) {
            header.setErrorMessage(Error.FAILD_CODE.getErrormessage());
            header.setCode(Error.FAILD_CODE.getCode());
            log.error(e.getMessage());
        }
        baseDtoResponse.setHeader(header);
        return baseDtoResponse;
    }

}
