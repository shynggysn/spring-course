package com.udemy.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionAspect {

    @Before("com.udemy.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetExceptionAdvice() {
        System.out.println("beforeGetExceptionAdvice: обрабатываем исключения при попытке получить книгу/журнал");
    }
}
