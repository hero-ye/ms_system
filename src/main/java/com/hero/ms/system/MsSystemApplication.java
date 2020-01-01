package com.hero.ms.system;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@Log
@EnableEurekaClient
@SpringBootApplication
public class MsSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsSystemApplication.class, args);
        log.info("已启动");
    }

}
