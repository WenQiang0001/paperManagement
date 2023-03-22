package com.example.papermanagementbe.util;

import lombok.Data;

@Data
public class PageDtoResponse<T> {
    private RequestHeader header;
    private int size;
    private T total;
}
