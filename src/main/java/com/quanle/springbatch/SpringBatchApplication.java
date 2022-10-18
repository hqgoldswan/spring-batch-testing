package com.quanle.springbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan({"com.quanle.config", "com.quanle.service", "com.quanle.listener",
                "com.quanle.reader",
                "com.quanle.processor",
                "com.quanle.writer",
                "com.quanle.controller"})

@EnableAsync // In order to use Async method in Spring Boot
//@EnableScheduling // In order to use scheduler functional in Spring Boot
public class SpringBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchApplication.class, args);
    }

}
