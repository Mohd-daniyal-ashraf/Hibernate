package com.hibeEclips.HibernateProjectEclips;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
		System.out.println("Project Hibernate started ....");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory);
		System.out.println(factory.isClosed());

		Student student = new Student();
		student.setId(3);
		student.setName("sk1");
		student.setCity("lucknow");
		System.out.println(student);

		// for saving the student object into DB
		Session se = factory.openSession();

		Transaction tx = se.beginTransaction();

		se.save(student);
		tx.commit();

		se.close();
		System.out.println("Done ...");
    }
}

