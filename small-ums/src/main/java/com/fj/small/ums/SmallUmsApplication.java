package com.fj.small.ums;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan(basePackages = "com.fj.small.ums.mapper")
@EnableDubbo
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SmallUmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallUmsApplication.class, args);
    }

}
