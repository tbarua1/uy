
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SimpleSaveTest {
	
	
	public static void main(String[] args) {
		HibernateUtil.setup("create table EVENTS ( EVENT_ID int, EVENT_DATE date, title VARCHAR);");
		// hibernate code start
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		Event theEvent = new Event();
		theEvent.setTitle("My Event");
		theEvent.setDate(new Date());

		session.save(theEvent);

		tx.commit();
		HibernateUtil.closeSession();

		HibernateUtil.sessionFactory.close();
		// hibernate code end
		HibernateUtil.checkData("select * from events;");

	}


}