package com.example.papermanagementbe.util;

import lombok.Data;

@Data
public class BaseDtoRequest<T> {
    private RequestHeader header;
    private T body;
}
