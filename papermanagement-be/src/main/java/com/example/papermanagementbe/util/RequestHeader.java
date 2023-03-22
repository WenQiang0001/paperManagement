package com.example.papermanagementbe.util;

import lombok.Data;

@Data
public class RequestHeader {
    /**
     * 定义人员类别：
     * 0：管理员
     * 1：教师
     * 2：学生
     */
    private String type;
}
