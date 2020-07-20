package com.xxx.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 注意这里已经不是 @RestController 了
// 与上个试验不同，由于需要返回视图，不能使用 @ResponseBody
@Controller
public class HelloController{
    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
}