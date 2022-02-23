package com.udemy.chapter1_IoCandDI;

public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow-meow!");
    }
}
