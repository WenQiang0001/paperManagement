package com.example.papermanagementbe.util;

import java.util.UUID;

public class NumberUtil {
    public static String getId(){
        return UUID.randomUUID().toString();
    }
}
