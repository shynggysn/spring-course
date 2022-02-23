package com.udemy.chapter2_aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary uLibrary = context.getBean("universityLibrary",UniversityLibrary.class);
        SchoolLibrary sLibrary = context.getBean("schoolLibrary",SchoolLibrary.class);

        uLibrary.getBook();
        uLibrary.getMagazine();
        sLibrary.getBook();
        sLibrary.getMagazine();
//        uLibrary.returnBook();
//        uLibrary.returnMagazine();
//        sLibrary.returnBook();
//        sLibrary.returnMagazine();


        context.close();

    }
}
