package com.xxx.springboot;

import com.xxx.springboot.first.UserOne;
import com.xxx.springboot.first.UserOneService;
import com.xxx.springboot.second.UserTwo;
import com.xxx.springboot.second.UserTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * ApplicationRunner 接口可以让在 Spring Boot 启动后马上执行想要执行的方法
 */
@Component
public class DataSourceTest implements ApplicationRunner {
    @Autowired
    public UserOneService userOneService;

    @Autowired
    public UserTwoService userTwoService;

    /**
    * 该方法再 Spring Boot 启动完成后立即执行
    */
    @Override
    public void run(ApplicationArguments args) {
        // 新建一个实体类
        UserOne userOne = new UserOne();
        userOne.setUsername("xxx1");
        userOne.setPassword("springboot1");
        // 调用 Service
        userOneService.save(userOne);
        UserTwo userTwo = new UserTwo();
        userTwo.setUsername("xxx2");
        userTwo.setPassword("springboot2");
        //调用 Service
        userTwoService.save(userTwo);
    }
}