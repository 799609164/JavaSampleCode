package com.xxx.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xxx.spring.bean.FileNameGenerator;

public class App {
    private static ApplicationContext context;
    
    public static void main( String[] args ) {
        context = new ClassPathXmlApplicationContext("SpringBeans.xml");

        FileNameGenerator obj = (FileNameGenerator) context.getBean("FileNameGenerator");
        obj.printFileName();
    }
}