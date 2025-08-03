package com.interviewprep;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(1, "ROHAN", "rohan@deloitte.com", "MALE", 1000, 26, "SE", 1));
		employeeList.add(new Employee(2, "RAHUL", "rahul@deloitte.com", "MALE", 2000, 27, "SE", 1));
		employeeList.add(new Employee(3, "RITIK", "ritik@deloitte.com", "MALE", 3000, 28, "SE", 1));
		employeeList.add(new Employee(4, "ROUSHAN", "roushan@deloitte.com", "MALE", 3000, 26, "SE", 1));
		employeeList.add(new Employee(5, "RISHAB", "rishab@deloitte.com", "MALE", 1000, 25, "QA", 2));
		employeeList.add(new Employee(6, "ROHIT", "rohit@deloitte.com", "MALE", 3000, 26, "QA", 2));
		employeeList.add(new Employee(7, "RIYA", "riya@deloitte.com", "FEMALE", 2000, 27, "SE", 1));
		employeeList.add(new Employee(8, "RISHI", "rishi@deloitte.com", "MALE", 3000, 28, "QA", 2));
		employeeList.add(new Employee(9, "RONALI", "ronali@deloitte.com", "FEMALE", 3000, 29, "SE", 1));
		employeeList.add(new Employee(10, "ROSHNI", "roshni@deloitte.com", "FEMALE", 1000, 25, "HR", 3));

		// TASK 1
		System.out.println("FEMALE EMPLOYEES IN EACH DEPARTMENT:");
		List<Employee> femaleEmployees = employee.FemaleEmployeesInEachDepartment(employeeList);
		femaleEmployees.forEach(System.out::println);

		// TASK 2
		System.out.println("\nEMPLOYEE WITH HIGHEST SALARY IN QA DEPARTMENT:");
		Optional<Employee> highestSalaryEmployee = employee.hasHighestSalaryInGivenDepartment(employeeList, "QA");
		highestSalaryEmployee.ifPresent(System.out::println);

		// TASK 3
		System.out.println("\nEMPLOYEE WORKING ALONE IN THEIR DEPARTMENT:");
		Optional<Employee> employeeWorkingAlone = employee.worksAloneInDepartment(employeeList);
		employeeWorkingAlone.ifPresent(System.out::println);
	}
}
