package com.udemy.manytomany.tests;

import com.udemy.manytomany.entity.Child;
import com.udemy.manytomany.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;
        try{
            session = sessionFactory.getCurrentSession();
            Section football = new Section("football");
            Child child1 = new Child("Zaur", 5);
            Child child2 = new Child("Ivan", 6);
            Child child3 = new Child("Kolya", 7);
            football.addChildtoSection(child1);
            football.addChildtoSection(child2);
            football.addChildtoSection(child3);

            session.beginTransaction();

            session.save(football);

            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
