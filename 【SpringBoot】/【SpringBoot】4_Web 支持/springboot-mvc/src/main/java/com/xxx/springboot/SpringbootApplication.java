package com.xxx.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringbootApplication {
    // // 实现 WebMvcConfigurer 接口的 addResourceHandlers 方法来自定义静态资源
    // // 设置配置类
    // @Configuration
    // static class WebConfig implements WebMvcConfigurer {
    //     // 重写 addResourceHandlers 方法
    //     @Override
    //     public void addResourceHandlers(ResourceHandlerRegistry registry) {
    //     // 设置静态资源映射路径为 /**，资源位置为类路径下的 upload
    //     registry.addResourceHandler("/**").addResourceLocations("classpath:/upload/");
    //     }
    // }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}