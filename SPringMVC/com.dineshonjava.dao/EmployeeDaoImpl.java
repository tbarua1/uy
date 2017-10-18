import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{
	 @Autowired
	 private SessionFactory sessionFactory;
	 
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		 sessionFactory.getCurrentSession().saveOrUpdate(employee);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> listEmployeess() {
		// TODO Auto-generated method stub
		return (List<Employee>) sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
		 
	}

	@Override
	public Employee getEmployee(int empid) {
		// TODO Auto-generated method stub
		 return (Employee) sessionFactory.getCurrentSession().get(Employee.class, empid);
		 
	}

	@Override
	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		 sessionFactory.getCurrentSession().createQuery("DELETE FROM Employee WHERE empid = "+employee.getEmpId()).executeUpdate();
	}

}
