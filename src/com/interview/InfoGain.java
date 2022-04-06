package com.interview;

import com.pojo.Department;
import com.pojo.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class InfoGain {


	public static void main(String[] args) {

		// THIS IS ONLY AN ILLUSTRATION. ACTUAL COLLECTION CAN BE VERY HUGE
		Collection<Employee> employees = Arrays.asList(
				new Employee(1,"Rahul",  100500, "delhi", new Department(1,"dept1")),
				new Employee(2, "Suresh", 90000, "blore", new Department(2,"dept2")),
				new Employee(3,"Rohan", 110000,"hybad", new Department(3,"dept3")),
				new Employee(4,"Mahesh",  200000, "blore", null),
				new Employee(5,"vikram", 210000, null, new Department(5,"dept4")),
				new Employee(6,"akash", 210000, null, new Department(6,"dept5")));

		// PROBLEM - 1
		List<String> empNames = prepareList_EmployeeName(employees);
		System.out.println(empNames);


		// PROBLEM - 2
		Map<String,String> emp_vs_deptName = prepareMap_EmployeeNameToDepartmentName(employees);
		System.out.println(emp_vs_deptName);

		// PROBLEM - 3
		List<Department> departments = prepareList_Department(employees);

		// PROBLEM - 4
		List<String> employees1  = prepareList_NonDepartment(employees);

		//PROBLEM - 5
		List<Department> deptList = prepareList_Department(employees);
		System.out.println(deptList);

		//PROBLEM -6
		double sumSalaries = sumOfAll_Salaries(employees);
		System.out.println(sumSalaries);

		//PROBLEM- 7
		Map<String, List<Employee>> slabwiseEmployees;
		// SALARY SLABs :
		//
		//	"SLAB-0" : salary < 50000
		//	"SLAB-1" : salary >= 50000
		//	"SLAB-2" : salary >= 100000

		System.out.println(getNameWhoseSalGt(employees));
	}

	// PREPARE A LIST OF EMPLOYEE NAMES | USE JAVA 8 STREAMS ONLY
	private static List<String> prepareList_EmployeeName(Collection<Employee> employees) {
			List<String> enameList = employees.stream().map(employee -> employee.getName()).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		return enameList;
	}

	// PREPARE A MAP : EMPLOYEE NAME TO DEPARTMENT NAME | USE JAVA 8 STREAMS ONLY
	private static Map<String,String> prepareMap_EmployeeNameToDepartmentName(Collection<Employee> employees) {
			/*Map<String, String> map = employees.stream()
					.collect(Collectors.toMap(employee -> employee.name,
							employee -> employee.deptName));*/
			Map<String, String> map2  = employees.stream()
					.collect(HashMap::new, (map,employee)->
							map.put(employee.getName(),
									employee.getDepartment() != null ?  employee.getDepartment().getDeptName() : null), HashMap::putAll);
		return map2;
	}

	// PREPARE A LIST OF DEPARTMENT WITH THEIR DATA | USE JAVA 8 STREAMS ONLY
	private static List<Department> prepareList_Department(Collection<Employee> employees) {

	return employees.stream().map(employee -> employee.getDepartment()).collect(Collectors.toList());

	}

	private static List<String> getNameWhoseSalGt(Collection<Employee> employees){
		return employees.stream().filter(employee -> employee.getSalary() > 100000)
				.map(employee -> employee.getName()).collect(Collectors.toList());
	}


	private static List<String> prepareList_NonDepartment(Collection<Employee> employees){
		return employees.stream().filter(employee -> employee.getDepartment() == null)
				.map(employee -> employee.getName()).collect(Collectors.toList());
	}

	public static double sumOfAll_Salaries(Collection<Employee> employees){
		//return employees.stream().mapToDouble(value -> value.getSalary()).reduce(0, (val1, val2) -> val1+val2);
		return employees.stream().collect(Collectors.summingDouble(employee -> employee.getSalary()));
	}

	public static Map<String, List<Employee>> slabWise_Employees(Collection<Employee> employees){
		/*return employees.stream().collect(HashMap::new, (map,employee)->
				map.put("SLAB-1",
						employee.getSalary() < 5000 ?  employee.getSalary()
						), HashMap::putAll);*/
		Predicate<Employee> p1 = employee -> employee.getSalary() <5000;
		Predicate<Employee> p2 = employee -> employee.getSalary() >9000;
		Predicate<Employee> p3 = employee -> employee.getSalary() >=15000;



		return null;

	}

}