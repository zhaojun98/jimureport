package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.mapper")
@SpringBootApplication(scanBasePackages = {"org.jeecg.modules.jmreport","com.example"})
public class ReportApplication {
    public static void main(String[] args) {

        SpringApplication.run(ReportApplication.class, args);
    }
}
