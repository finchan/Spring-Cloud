package com.forezp.sleuth;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import zipkin.server.internal.EnableZipkinServer;
import zipkin.storage.mysql.MySQLStorage;

import javax.sql.DataSource;

@EnableEurekaClient
@EnableZipkinServer
@SpringBootApplication
public class SleuthZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthZipkinApplication.class, args);
    }

    @Bean
    public MySQLStorage mySQLStorage(@Qualifier("dataSource") DataSource datasource) {
        return MySQLStorage.builder().datasource(datasource).executor(Runnable::run).build();
    }

}
