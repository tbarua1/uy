package one2one;
import javax.persistence.*;
import one_2_one.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.*;
public class Persistnace {
public static void main(String[] args) {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();	
	
	//persist example - with transaction
	Session session2 = sessionFactory.openSession();
	Transaction tx2 = session2.beginTransaction();
	//Employee emp2 = HibernateSaveExample.getTestEmployee();
	//session2.persist(emp2);
	System.out.println("Persist called");
	//emp2.setName("Kumar"); // will be updated in database too
	System.out.println("Employee Name updated");
	//System.out.println("8. Employee persist called with transaction, id="+emp2.getId()+", address id="+emp2.getAddress().getId());
	tx2.commit();
	System.out.println("*****");
	
	// Close resources
	sessionFactory.close();
}
}
