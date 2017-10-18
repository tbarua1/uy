package record_update;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o=session.load(Product.class,new Integer(105));
		Product s=(Product)o;
 
		Transaction tx = session.beginTransaction();	
 
//s.setStno(105);   should not update, because we loaded with that number right..?
		s.setPrice(4000);   // implicitly update method will be called..
 
		tx.commit();
 
		System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close();
	}

}
