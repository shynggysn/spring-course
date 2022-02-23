package com.udemy.chapter2_aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("com.udemy.chapter2_aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: логирование при попытке получить книгу");
    }

    @Before("execution(* return*())")
    public void beforeReturnLoggingAdvice(){
        System.out.println("beforeReturnLoggingAdvice: логирование при попытке вернуть книгу");
    }
}
