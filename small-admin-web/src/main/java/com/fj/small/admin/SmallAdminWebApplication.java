package com.fj.small.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @SpringBootApplication(exclude = DataSourceAutoConfiguration.class):自动排除数据源的配置
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SmallAdminWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallAdminWebApplication.class, args);
    }

}
