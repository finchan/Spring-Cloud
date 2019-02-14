package com.forezp.eurekaribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonLoadBalanceClientController {
    @Autowired
    private LoadBalancerClient loadBalancer;
    @GetMapping("/testRibbon")
    public String  testRibbon() {
        ServiceInstance instance = loadBalancer.choose("eureka-client");
        return instance.getHost()+":"+instance.getPort();
    }
}
