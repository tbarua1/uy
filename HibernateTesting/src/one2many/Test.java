package one2many;

import java.util.Date;

import org.hibernate.Session;

import one_2_one.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate one to many (Annotation)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Stock stock = new Stock();
	        stock.setStockCode("7052");
	        stock.setStockName("PADINI");
	        session.save(stock);

	        StockDailyRecord stockDailyRecords = new StockDailyRecord();
	        stockDailyRecords.setPriceOpen(new Float("1.2"));
	        stockDailyRecords.setPriceClose(new Float("1.1"));
	        stockDailyRecords.setPriceChange(new Float("10.0"));
	        stockDailyRecords.setVolume(3000000L);
	        stockDailyRecords.setDate(new Date());

	        stockDailyRecords.setStock(stock);
	        stock.getStockDailyRecords().add(stockDailyRecords);

	        session.save(stockDailyRecords);

		session.getTransaction().commit();
		System.out.println("Done");
	}

}
