package com.forezip.eurekafeignclient.client.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

@Configuration
public class FeignConfig {
    @Bean
    public Retryer feignRetryer() {
        //interval 100 ms, maximum time 1 s, retry 5 times
        return new Retryer.Default(100, SECONDS.toMillis(1), 5);
    }
}
