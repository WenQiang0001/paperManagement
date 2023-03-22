package com.example.papermanagementbe.service;

import com.example.papermanagementbe.dto.LoginDto;
import com.example.papermanagementbe.schema.TeacherSchema;
import com.example.papermanagementbe.util.BaseDtoRequest;
import com.example.papermanagementbe.util.BaseDtoResponse;

import java.util.List;

public interface LoginService {
    //登录校验
    BaseDtoResponse queryType(BaseDtoRequest<LoginDto> loginDto);
}
