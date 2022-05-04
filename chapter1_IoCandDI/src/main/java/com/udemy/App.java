package com.udemy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //IoC
        /*ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet myPet = applicationContext.getBean("myPet",Pet.class);
        myPet.say();*/

        //DI
        /*ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet myPet = applicationContext.getBean("myPet",Pet.class);
        Person person = new Person(myPet);
        person.callYourPet();*/

        //DI with constructor-arg addition
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = applicationContext.getBean("myPerson", Person.class);
        person.callYourPet();

        applicationContext.close();
    }
}
