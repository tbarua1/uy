package structural.composit;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	 private String name;
	   private String dept;
	   private int salary;
	   private List<Employee> subordinates;
	
	   public Employee(String name, String dept, int salary, List<Employee> subordinates) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.subordinates = subordinates;
	}
	   public Employee(String name, String dept, int salary) {
			super();
			this.name = name;
			this.dept = dept;
			this.salary = salary;
			this.subordinates = new ArrayList<Employee>();
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public List<Employee> getSubordinates() {
		return subordinates;
	}
	public void setSubordinates(List<Employee> subordinates) {
		this.subordinates = subordinates;
	}
	public void add(Employee headSales) {
		// TODO Auto-generated method stub
		subordinates.add(headSales);
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + ", subordinates=" + subordinates
				+ "]";
	}
	

}
