package many2many;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import one_2_one.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Hibernate many to many (Annotation)");
			Session session = HibernateUtil.getSessionFactory().openSession();

			session.beginTransaction();

			Stock stock = new Stock();
		        stock.setStockCode("7052");
		        stock.setStockName("PADINI");

		        Category category1 = new Category("CONSUMER", "CONSUMER COMPANY");
		        Category category2 = new Category("INVESTMENT", "INVESTMENT COMPANY");

		        Set<Category> categories = new HashSet<Category>();
		        categories.add(category1);
		        categories.add(category2);

		        stock.setCategories(categories);

		        session.save(stock);

			session.getTransaction().commit();
			System.out.println("Done");
	}

}
