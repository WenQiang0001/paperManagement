package com.example.papermanagementbe.util;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ResponseHeader {
    /**
     * 状态码：正常：200  错误：500
     */
    private String code;
    private String errorMessage;
}
