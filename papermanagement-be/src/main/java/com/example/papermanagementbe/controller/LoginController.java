package com.example.papermanagementbe.controller;

import com.example.papermanagementbe.dto.LoginDto;
import com.example.papermanagementbe.err.Error;
import com.example.papermanagementbe.schema.StudentSchema;
import com.example.papermanagementbe.service.LoginService;
import com.example.papermanagementbe.util.BaseDtoRequest;
import com.example.papermanagementbe.util.BaseDtoResponse;
import com.example.papermanagementbe.util.ResponseHeader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/loginIndex")
public class LoginController {
    @Resource
    private LoginService loginService;

    /**
     * 登录页面
     * @param loginDto
     * @return
     */
    @PostMapping("/login")
    public BaseDtoResponse<StudentSchema> queryType(@RequestBody BaseDtoRequest<LoginDto> loginDto) {
        ResponseHeader header = new ResponseHeader();
        BaseDtoResponse<StudentSchema> baseDtoResponse = new BaseDtoResponse<>();
        try {
            baseDtoResponse = loginService.queryType(loginDto);
        } catch (Exception e) {
            header.setErrorMessage(Error.FAILD_CODE.getErrormessage());
            header.setCode(Error.FAILD_CODE.getCode());
            log.error(e.getMessage());
        }
        return baseDtoResponse;
    }
}
