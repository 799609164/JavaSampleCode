package com.xxx.spring.customer.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private static ApplicationContext context;

    public static void main( String[] args ) {
        context = new ClassPathXmlApplicationContext(new String[] {"SpringBeans.xml"});

        CustomerService CSA = (CustomerService) context.getBean("CustomerService");
        CSA.setMessage("Message by CSA");
        // singleton 情况下：Message by CSA
        // prototype 情况下：Message by CSA
        System.out.println("Message : "+ CSA.getMessage());

        //retrieve it again
        CustomerService CSB = (CustomerService) context.getBean("CustomerService");
        // singleton 情况下：Message by CSA
        // prototype 情况下：null
        // prototype 情况下：每调用一次 getBean() 方法后，都会得到一个新的实例
        System.out.println("Message : "+ CSB.getMessage());
    }
}