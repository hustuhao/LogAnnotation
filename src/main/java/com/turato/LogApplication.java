package com.turato;

import com.turato.starter.annotation.EnableLogRecord;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableLogRecord(tenant="com.turato.test")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@EnableTransactionManagement
@Slf4j
public class LogApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(LogApplication.class, args);
        } catch (Exception e) {
            log.info("错误",e);
        }
    }

}
