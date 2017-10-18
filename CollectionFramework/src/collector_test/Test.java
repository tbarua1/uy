package collector_test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] e = { new Employee("Mr xyz", 5), new Employee("Mr abc", 15), new Employee("Mr kbc", 25),
				new Employee("Mr aaa", 35), new Employee("Mr xy", 45), new Employee("Mr xz", 55),
				new Employee("Mr yz", 65), new Employee("Mr z", 75) };

		List<Employee> lst = Arrays.asList(e);
		Map<Boolean, List<Employee>> employeeMap = lst.stream()
				.collect(Collectors.partitioningBy((Employee emp) -> emp.getAge() > 30));
		System.out.println("Employees are being partitioned on the bases of Age");
		employeeMap.forEach((Boolean key, List<Employee> empList) -> System.out.println(key + " " + empList));
	}

}
