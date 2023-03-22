package com.example.papermanagementbe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.papermanagementbe.mapper")
public class PaperManagementBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaperManagementBeApplication.class, args);
    }

}
