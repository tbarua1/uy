import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Test {
    private static SessionFactory sessionFactory;
    private static SessionFactory getSessionFactory5() {
        if (sessionFactory == null) {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            return sessionFactory;
        } else {
            return sessionFactory;
        }

    }
//      public static SessionFactory getSessionFactory() {
//        if (sessionFactory == null) {
//            Configuration configuration = new Configuration().configure();
//            ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
//            registry.applySettings(configuration.getProperties());
//            ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
//             
//            sessionFactory = configuration.buildSessionFactory(serviceRegistry);           
//        }
//         
//        return sessionFactory;
//    }
    public static SessionFactory createSessionFactory() {
    Configuration configuration = new Configuration();
    configuration.configure();
    StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
                 configuration.getProperties()).build();
    //ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
           // configuration.getProperties()). buildServiceRegistry();
    return configuration.buildSessionFactory(serviceRegistry);
}
	
	public static void main(String[] args) {
       // SessionFactory sessionFactory5 = Test.getSessionFactory5();
        // TODO Auto-generated method stub
                
//                Configuration cfg = new Configuration();
//		cfg.configure("hibernate.cfg.xml");  
//		SessionFactory createSessionFactory() = cfg.buildSessionFactory();
//		          System.out.println("Session Creation done");
//		try{
//	         createSessionFactory() = new Configuration().configure().buildSessionFactory();
//	      }catch (Throwable ex) { 
//	         System.err.println("Failed to create sessionFactory object." + ex);
//	        // throw new ExceptionInInitializerError(ex); 
//	      }
	      Test ME = new Test();

	      /* Add few employee records in database */
	      Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
	      Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
	      Integer empID3 = ME.addEmployee("John", "Paul", 10000);

	      /* List down all the employees */
	      ME.listEmployees();

	      /* Update employee's records */
	      ME.updateEmployee(empID1, 5000);

	      /* Delete an employee from the database */
	      ME.deleteEmployee(empID2);

	      /* List down new list of the employees */
	      ME.listEmployees();
	}
	private void deleteEmployee(Integer EmployeeID) {
		// TODO Auto-generated method stub
		Session session = Test.getSessionFactory5().openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         Employee employee = 
	                   (Employee)session.get(Employee.class, EmployeeID); 
	         session.delete(employee); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	}
	private void updateEmployee(Integer EmployeeID, int salary) {
		// TODO Auto-generated method stub
		 Session session = Test.getSessionFactory5().openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         Employee employee = 
	                    (Employee)session.get(Employee.class, EmployeeID); 
	         employee.setSalary( salary );
			 session.update(employee); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }	
	}
	private void listEmployees() {
		// TODO Auto-generated method stub
		Session session = Test.getSessionFactory5().openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         List employees = session.createQuery("FROM Employee").list(); 
	         for (Iterator iterator = 
	                           employees.iterator(); iterator.hasNext();){
	            Employee employee = (Employee) iterator.next(); 
	            System.out.print("First Name: " + employee.getFirstName()); 
	            System.out.print("  Last Name: " + employee.getLastName()); 
	            System.out.println("  Salary: " + employee.getSalary()); 
	         }
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }	
	}
	private Integer addEmployee(String fname, String lname, int salary) {
	Session session = Test.getSessionFactory5().openSession();
	      Transaction tx = null;
	      Integer employeeID = null;
	      try{
	         tx = session.beginTransaction();
	         Employee employee = new Employee(fname, lname, salary);
	         employeeID = (Integer) session.save(employee); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return employeeID;
	}

}
