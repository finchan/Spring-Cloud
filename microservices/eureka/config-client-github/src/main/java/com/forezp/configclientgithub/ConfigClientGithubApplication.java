package com.forezp.configclientgithub;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConfigClientGithubApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientGithubApplication.class, args);
    }
    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/foo")
    public String hi(){
        return foo;
    }
}
