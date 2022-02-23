package com.udemy.chapter2_aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.udemy.chapter2_aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
