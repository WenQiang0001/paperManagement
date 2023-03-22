package com.example.papermanagementbe.util;

import lombok.Data;

@Data
public class BaseDtoResponse<T> {
    private ResponseHeader header;
    private T body;
}
