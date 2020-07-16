package com.xxx.spring.aop.advice;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class HijackAfterMethod implements AfterReturningAdvice {
    // method 运行后，直到返回结果后，才运行下边的代码
    // 如果没有返回结果，将不运行切入的代码
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("HijackAfterMethod : After method hijacked!");
    }
}