package com.forezp.bootadmineurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BootadmineurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootadmineurekaserverApplication.class, args);
    }

}
