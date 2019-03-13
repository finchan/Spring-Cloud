package com.forezp.userservicezipkinrabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UserServiceZipkinRabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceZipkinRabbitmqApplication.class, args);
    }

}
