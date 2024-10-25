package ObjectMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// Emp object
		Emp emp1 = new Emp();
		emp1.seteId(111);
		emp1.setName("Daniyal");
		Emp emp2 = new Emp();
		emp2.seteId(222);
		emp2.setName("sk");

		List<Emp> emps = new ArrayList<Emp>();
		emps.add(emp1);
		emps.add(emp2);

		// Projects objects
		Project pro1 = new Project();
		pro1.setpId(111);
		pro1.setName("online booking system");
		Project pro2 = new Project();
		pro2.setpId(222);
		pro2.setName("Billing system");

		List<Project> projects = new ArrayList<Project>();
		projects.add(pro1);
		projects.add(pro2);

		emp1.setProject(projects);
		emp2.setProject(projects);

		// Many ro Many
		pro1.setEmp(emps);
		pro2.setEmp(emps);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(emp1);
		session.save(emp2);
		session.save(pro1);
		session.save(pro2);

		tx.commit();
		session.close();
	}

}
