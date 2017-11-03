package com.rishiqing.qywx.service.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class DemoPrototype {
    @Autowired
    private DemoService demoService;

    public String showHello(){
        return demoService.printHelloWorld();
    }
}
