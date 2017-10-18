import java.io.Serializable;

public class Employee implements Serializable
{

	private static final long serialVersionUID = 1L;
	String name;
	int age;
transient int salary;
	
	Employee(String name, int age,int salary) {
	this.name=name;
	this.age=age;
	this.salary=salary;
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
