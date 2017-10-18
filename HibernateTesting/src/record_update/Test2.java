package record_update;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();	
 
		Product p=new Product();
		p.setProductId(104);  // 104 must be in the DB
		p.setProName("Someting");		
 
		Transaction tx = session.beginTransaction();
			session.update(p);
		tx.commit();
 
		System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close();
	}

}
