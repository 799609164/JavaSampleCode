package com.xxx.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class xxxController {
    @Value("${hello}")
    private String hello;

    @RequestMapping("xxx")
    public String xxx() {
        return hello;
    }
}