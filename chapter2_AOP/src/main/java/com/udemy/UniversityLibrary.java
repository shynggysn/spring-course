package com.udemy;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends Library {

    @Override
    public void getBook() {
        System.out.println("Getting books from UniversityLibrary");
    }

    @Override
    public void getMagazine() {
        System.out.println("берем журнал из UniversityLibrary");
    }

    @Override
    public void returnBook() {
        System.out.println("возвращяем книгу в UniversityLibrary");
    }

    @Override
    public void returnMagazine() {
        System.out.println("возвращяем журнал в UniversityLibrary");
    }
}
