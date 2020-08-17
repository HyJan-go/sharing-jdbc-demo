package com.db.sharingjdbcdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 雪花算法的缺陷：如果时间不连续进行访问，很容易出现全是单数，或者全是双数的这种会造成数据都在一个表中
 * 高并发场景才适用雪花算法
 */
@MapperScan(basePackages = {"com.db.sharingjdbcdemo.model.mapper"})
@SpringBootApplication
public class SharingJdbcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharingJdbcDemoApplication.class, args);
    }

}
