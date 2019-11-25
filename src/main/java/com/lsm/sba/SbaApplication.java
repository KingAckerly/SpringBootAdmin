package com.lsm.sba;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//EnableAdminServer 开启 springboot admin
@EnableAdminServer
@EnableEurekaClient
public class SbaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbaApplication.class, args);
    }


}
