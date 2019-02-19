package com.forezip.eurekafeignclient.client.hystrix;

import com.forezip.eurekafeignclient.client.EurekaClientFeign;
import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi, " + name + ", sorry, error!";
    }
}
