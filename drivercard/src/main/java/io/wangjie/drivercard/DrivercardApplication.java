package io.wangjie.drivercard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.wangjie.drivercard.dao")
public class DrivercardApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrivercardApplication.class, args);
    }

}
