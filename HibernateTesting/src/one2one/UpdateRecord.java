package one2one;

import one_2_one.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UpdateRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee1 emp = (Employee1) session.load(Employee1.class, new Long(101));
		System.out.println("Employee object loaded. " + emp);
		tx.commit();

		// update example
		emp.setName("Updated name");
		emp.getAddress();
                emp.setCity("Bangalore");
		Transaction tx7 = session.beginTransaction();
		session.update(emp);
		emp.setName("Final updated name");
		System.out.println("13. Before committing update transaction");
		tx7.commit();
		System.out.println("14. After committing update transaction");

		// Close resources
		sessionFactory.close();

	}

}
