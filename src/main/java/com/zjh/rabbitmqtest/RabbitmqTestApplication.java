package com.zjh.rabbitmqtest;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableSwagger2Doc
@EnableRabbit
@MapperScan(basePackages = "com.zjh.rabbitmqtest.mapper")
public class RabbitmqTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqTestApplication.class, args);
    }

}
