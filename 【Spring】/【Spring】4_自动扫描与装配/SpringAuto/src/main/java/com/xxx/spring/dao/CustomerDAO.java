package com.xxx.spring.dao;

import org.springframework.stereotype.Component;

// 注释 @Component 修饰的类是一个自动扫描组件
@Component
public class CustomerDAO {
    @Override
    public String toString() {
        return "Hello , This is CustomerDAO";
    }
}