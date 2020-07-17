package com.xxx.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 加载 classpath 目录下的 xxx.properties 文件
@PropertySource(value = "classpath:xxx.properties")
public class Controller{
    
    // 使用 @Value 注解注入属性值
	// @Value("${xxx.springboot}")
    @Value("${xxx.test}")
    private String s;

    @RequestMapping("hello")
    public String helloWorld(){
        return s;
    }
}