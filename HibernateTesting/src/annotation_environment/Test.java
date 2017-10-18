package annotation_environment;
import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Test {

	 private static SessionFactory factory; 
	   public static void main(String[] args) {
	      try{
	         factory = new AnnotationConfiguration().
	                   configure().
	                   //addPackage("com.xyz") //add package if used.
	                   addAnnotatedClass(ManageEmployee.class).
	                   buildSessionFactory();
	      }catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
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
		private void updateEmployee(Integer EmployeeID, int salary) {
			/*
			 * String hql = "UPDATE Employee set salary = :salary "  + 
             "WHERE id = :employee_id";
Query query = session.createQuery(hql);
query.setParameter("salary", 1000);
query.setParameter("employee_id", 10);
int result = query.executeUpdate();
System.out.println("Rows affected: " + result);*/
			
			 Session session = factory.openSession();
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
		
		private void listEmployeesSelectClause() {
			// TODO Auto-generated method stub
			Session session = factory.openSession();
		      Transaction tx = null;
		      try{
		         tx = session.beginTransaction();
		       List employees = session.createQuery("SELECT E.firstName FROM Employee E").list(); 
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
		         session.close(); 
		      }	
		}
		private void listEmployeesWhereClause() {
			// TODO Auto-generated method stub
			Session session = factory.openSession();
		      Transaction tx = null;
		      try{
		         tx = session.beginTransaction();
		       List employees = session.createQuery("FROM Employee E WHERE E.id = 10").list(); 
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
		private void listEmployeesAsClause() {
			// TODO Auto-generated method stub
			Session session = factory.openSession();
		      Transaction tx = null;
		      try{
		         tx = session.beginTransaction();
		        
		         List employees = session.createQuery("FROM Employee AS E").list(); 
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
		private void listEmployeesNamedParameter() {
			/*Session session = SessionFactory.openSession();
Query query = session.createQuery("FROM EMPLOYEE");
query.setCacheable(true);
query.setCacheRegion("employee");
List users = query.list();
SessionFactory.closeSession();*/
			Session session = factory.openSession();
		      Transaction tx = null;
		      try{
		         tx = session.beginTransaction();
		         String hql = "FROM Employee E WHERE E.id = :employee_id";
		         Query query = session.createQuery(hql);
		         query.setParameter("employee_id",10);
		         List employees = query.list();
		            
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
		private void listEmployeesGroupByClause() {
			/*Criteria cr = session.createCriteria(Employee.class);

// To get records having salary more than 2000
cr.add(Restrictions.gt("salary", 2000));

// To get records having salary less than 2000
cr.add(Restrictions.lt("salary", 2000));

// To get records having fistName starting with zara
cr.add(Restrictions.like("firstName", "zara%"));

// Case sensitive form of the above restriction.
cr.add(Restrictions.ilike("firstName", "zara%"));

// To get records having salary in between 1000 and 2000
cr.add(Restrictions.between("salary", 1000, 2000));

// To check if the given property is null
cr.add(Restrictions.isNull("salary"));

// To check if the given property is not null
cr.add(Restrictions.isNotNull("salary"));

// To check if the given property is empty
cr.add(Restrictions.isEmpty("salary"));

// To check if the given property is not empty
cr.add(Restrictions.isNotEmpty("salary"));
Criterion salary = Restrictions.gt("salary", 2000);
Criterion name = Restrictions.ilike("firstNname","zara%");

// To get records matching with OR conditions
LogicalExpression orExp = Restrictions.or(salary, name);
cr.add( orExp );


// To get records matching with AND conditions
LogicalExpression andExp = Restrictions.and(salary, name);
cr.add( andExp );

List results = cr.list();*/
			Session session = factory.openSession();
		      Transaction tx = null;
		      try{
		         tx = session.beginTransaction();
		         List employees = session.createQuery("SELECT SUM(E.salary), E.firtName FROM Employee E GROUP BY E.firstName").list(); 
			        
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
		private void listEmployeesOrderByClause() {
			/*String hql = "FROM Employee";
Query query = session.createQuery(hql);
query.setFirstResult(1);
query.setMaxResults(10);
List results = query.list();*/
			Session session = factory.openSession();
		      Transaction tx = null;
		      try{
		         tx = session.beginTransaction();
		         List employees = session.createQuery("FROM Employee E WHERE E.id > 10 ORDER BY E.firstName DESC, E.salary DESC ").list(); 
			        
		        // List employees = session.createQuery("FROM Employee E WHERE E.id > 10 ORDER BY E.salary DESC").list(); 
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
		private void listEmployees() {
			/*String hql = "SELECT count(distinct E.firstName) FROM Employee E";
Query query = session.createQuery(hql);
List results = query.list();*/
			Session session = factory.openSession();
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
		public Integer addEmployee(String fname, String lname, int salary){
			/*String hql = "INSERT INTO Employee(firstName, lastName, salary)"  + 
             "SELECT firstName, lastName, salary FROM old_employee";
Query query = session.createQuery(hql);
int result = query.executeUpdate();
System.out.println("Rows affected: " + result);*/
	      Session session = factory.openSession();
	      Transaction tx = null;
	      Integer employeeID = null;
	      try{
	         tx = session.beginTransaction();
	         ManageEmployee employee = new ManageEmployee();
	         employee.setFirstName(fname);
	         employee.setLastName(lname);
	         employee.setSalary(salary);
	         employeeID = (Integer) session.save(employee); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return employeeID;
	      /*Session session = SessionFactory.openSession();
Transaction tx = session.beginTransaction();
for ( int i=0; i<100000; i++ ) {
    Employee employee = new Employee(.....);
    session.save(employee);
}
tx.commit();
session.close();*/
	   }

	   public void deleteEmployee(Integer EmployeeID){
		   /*
		    String hql = "DELETE FROM Employee "  + 
             "WHERE id = :employee_id";
Query query = session.createQuery(hql);
query.setParameter("employee_id", 10);
int result = query.executeUpdate();
System.out.println("Rows affected: " + result);*/
	      Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         ManageEmployee employee = 
	                   (ManageEmployee)session.get(ManageEmployee.class, EmployeeID); 
	         session.delete(employee); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	   }
}
