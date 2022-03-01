package com.udemy.chapter1_IoCandDI;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Wow-wow!");
    }
}
