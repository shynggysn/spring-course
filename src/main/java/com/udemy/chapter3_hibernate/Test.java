package com.udemy.chapter3_hibernate;

import com.udemy.chapter3_hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = sessionFactory.getCurrentSession();
            Employee employee = new Employee("Eden", "Hirov", "HR", 350);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        }
        finally{
            sessionFactory.close();
        }
    }
}
