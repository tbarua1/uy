package one2one;

import one_2_one.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Merging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee1 emp = (Employee1) session.load(Employee1.class, new Long(101));
		System.out.println("Employee object loaded. " + emp);
		tx.commit();

		 //merge example - data already present in tables
		 emp.setSalary(25000);
		 Transaction tx8 = session.beginTransaction();
		 Employee1 emp4 = (Employee1) session.merge(emp);
		 System.out.println(emp4 == emp); // returns false
		 emp.setName("Test");
		 emp4.setName("Kumar");
		 System.out.println("15. Before committing merge transaction");
		 tx8.commit();
		 System.out.println("16. After committing merge transaction");

		// Close resources
		sessionFactory.close();
	}

}
