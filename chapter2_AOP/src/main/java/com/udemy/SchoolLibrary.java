package com.udemy;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends Library {

    @Override
    public void getBook() {
        System.out.println("берем книгу из SchoolLibrary");
    }

    @Override
    public void getMagazine() {
        System.out.println("берем журнал из SchoolLibrary");
    }

    @Override
    public void returnBook() {
        System.out.println("возвращяем книгу в SchoolLibrary");
    }

    @Override
    public void returnMagazine() {
        System.out.println("возвращяем журнал в SchoolLibrary");
    }
}
