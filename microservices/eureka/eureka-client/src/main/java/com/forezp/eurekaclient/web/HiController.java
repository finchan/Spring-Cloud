package com.forezp.eurekaclient.web;

//import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    //    @Autowired
//    Environment environment;
    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;
//        return "hi "+name+",i am from port:" + environment.getProperty("local.server.port");
    }
}
