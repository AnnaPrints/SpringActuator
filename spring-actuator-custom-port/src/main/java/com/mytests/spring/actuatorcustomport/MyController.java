package com.mytests.spring.actuatorcustomport;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *
 * <p>Created by irina on 14.09.2021.</p>
 * <p>Project: spring-actuator-custom-port</p>
 * *
 */
@RestController
public class MyController {

    @RequestMapping("/")
    public String home() {
        
        return "home";
    }
    @RequestMapping("/test1")
    public String test1() {

        return "test1";
    }
}
