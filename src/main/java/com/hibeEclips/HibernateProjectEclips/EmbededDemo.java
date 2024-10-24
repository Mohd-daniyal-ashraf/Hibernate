package com.hibeEclips.HibernateProjectEclips;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbededDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Certificate certificate1 = new Certificate();
		certificate1.setCource_name("Java full stack");
		certificate1.setDuration("3 Month");

		Student stu1 = new Student();
		stu1.setName("amir");
		stu1.setCity("tanda");
		stu1.setId(123);
		stu1.setCertificate(certificate1);

		Certificate certificate2 = new Certificate();
		certificate2.setCource_name("Manual testing");
		certificate2.setDuration("2 Month");

		Student stu2 = new Student();
		stu2.setName("faizan");
		stu2.setCity("hydrabad");
		stu2.setId(432);
		stu2.setCertificate(certificate2);

		// open session and transaction

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		// save objects
		session.save(stu1);
		session.save(stu2);

		transaction.commit();
		factory.close();
	}
}
