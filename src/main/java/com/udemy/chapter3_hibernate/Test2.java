package com.udemy.chapter3_hibernate;

import com.udemy.chapter3_hibernate.entity.Department;
import com.udemy.chapter3_hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).buildSessionFactory();
             Session session = factory.getCurrentSession())
        {
            session.beginTransaction();

            Department department = session.get(Department.class, 8);

            System.out.println(department);
            System.out.println(department.getEmpls());

            session.getTransaction().commit();
        }
    }
}