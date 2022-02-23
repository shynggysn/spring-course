package com.udemy.chapter1_IoCandDI;

public class Person {
    private Pet pet;

    public Person(Pet pet){
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my pet");
        pet.say();
    }
}