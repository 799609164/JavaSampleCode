package com.xxx.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Dog {
    @Autowired
    private Person person;
    private String name;

    public Person getPerson() {
        return person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // @Autowired 注解不用 setter 方法
    /*
    @Required
    public void setPerson(Person person) {
        this.person = person;
    }
    */

    @Override
    public String toString() {
        return "Dog{" + "person=" + person + ", name='" + name + '\'' + '}';
    }
}