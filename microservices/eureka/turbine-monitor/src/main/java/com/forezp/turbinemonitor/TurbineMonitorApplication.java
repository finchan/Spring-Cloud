package com.forezp.turbinemonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
@SpringBootApplication
@EnableTurbine
public class TurbineMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineMonitorApplication.class, args);
    }

}
