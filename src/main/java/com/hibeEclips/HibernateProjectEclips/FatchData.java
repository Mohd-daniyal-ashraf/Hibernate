package com.hibeEclips.HibernateProjectEclips;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class FatchData {
	public static void main(String[] args) {
//		 Fatcing the data with help of get() and load() method
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session se = factory.openSession();
		Student student = (Student) se.load(Student.class, 1);
		System.out.println(student);

		se.close();
		factory.close();
		System.out.println("Done...");
	}
}
