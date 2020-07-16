package com.xxx.spring.collections;

import java.util.*;

import com.xxx.spring.innerbean.Person;

public class Customer {
    // 这里的 lists 要和 Bean 中 property 标签的 name 一样
    private List<Object> lists; 
    private Set<Object> sets ;
    private Map<Object, Object> maps ;
    private Properties pros;

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Set<Object> getSets() {
        return sets;
    }

    public void setSets(Set<Object> sets) {
        this.sets = sets;
    }

    public Map<Object, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<Object, Object> maps) {
        this.maps = maps;
    }

    public Properties getPros() {
        return pros;
    }

    public void setPros(Properties pros) {
        this.pros = pros;
    }

    // 不要忘记写内部要引用的 Bean
    private Person person; 

    public Customer(Person person) {
        this.person = person;
    }

    public Customer() {
 
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Customer [person=" + person + "]";
    }
}