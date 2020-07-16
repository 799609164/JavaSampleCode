package com.xxx.spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class HijackThrowExceptionMethod implements ThrowsAdvice {
    // 劫持 IllegalArgumentException 异常
    // 目标 method 运行时，抛出 IllegalArgumentException 异常后，运行切入的方法
    public void afterThrowing(IllegalArgumentException e) throws Throwable {
        System.out.println("HijackThrowException : Throw exception hijacked!");
    }

}