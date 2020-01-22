package com.fj.small.pms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.fj.small.pms.mapper")  // 与mybatis-plus整合就需要包扫描
@EnableDubbo   // 开启dubbo
@SpringBootApplication
public class SmallPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallPmsApplication.class, args);
    }

}
