package com.xxx.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xxx.spring.dao.CustomerDAO;

@Component
public class CustomerService {
    @Autowired
    CustomerDAO customerDAO;

    // 自动注入不需要 setter 方法
    // public void setCustomerDAO(CustomerDAO customerDAO) {
    //     this.customerDAO = customerDAO;
    // }

    @Override
    public String toString() {
        return "CustomerService [customerDAO = " + customerDAO + "]";
    }
}