package com.example.papermanagementbe.util;

import lombok.Data;

@Data
public class PageDtoRequest<T> {
    private RequestHeader header;
    private T body;
}
