package com.smirnovkoss.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.smirnovkoss.hibernate_test.entity.Employees;

public class TestHibernateUPDATE {
	public static void main(String[] args) { 
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Employees.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
            session.beginTransaction();

            Employees emp = session.get(Employees.class, 1);
            emp.setSalary(1500);

            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("update Employees set salary = 2000 WHERE first_name = 'Henry'").executeUpdate();

            session.getTransaction().commit();
        } finally {
        	factory.close();
        }
	
	}
}
