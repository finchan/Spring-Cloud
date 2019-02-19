package com.forezip.eurekafeignclient.client;

import com.forezip.eurekafeignclient.client.config.FeignConfig;
import com.forezip.eurekafeignclient.client.hystrix.HiHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="eureka-client", configuration = FeignConfig.class, fallback = HiHystrix.class)
public interface EurekaClientFeign {
    @GetMapping(value="/hi")
    String sayHiFromClientEureka(@RequestParam(value="name") String name);
}
