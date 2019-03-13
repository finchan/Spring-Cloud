package com.forezp.zipkinserverrabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@EnableEurekaClient
@EnableZipkinStreamServer
@SpringBootApplication
public class ZipkinServerRabbitmqMySQLApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerRabbitmqMySQLApplication.class, args);
    }

}
