package com.udemy.chapter3_hibernate;

import com.udemy.chapter3_hibernate.entity.Department;
import com.udemy.chapter3_hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();
            Department department = new Department("IT", 300, 1200);

            Employee emp1 = new Employee("Zaur", "Tregulov", 800);
            Employee emp2 = new Employee("Vladislav", "Sapozhnikov", 1000);

            department.addEmployeeToDepartment(emp1);
            department.addEmployeeToDepartment(emp2);

            session.beginTransaction();
            session.save(department);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
