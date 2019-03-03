package com.forezp.configservergitremote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerGitRemoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerGitRemoteApplication.class, args);
    }

}
