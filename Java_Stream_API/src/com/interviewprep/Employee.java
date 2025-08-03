package com.interviewprep;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {

    int employeeId;
    String employeeName;
    String employeeEmail;
    String employeeGender;
    int employeeSalary;
    int employeeAge;
    String departmentName;
    int departmentId;

    // TASK 1
    // Find list of Female employees for each department sorted according to their salary.
    public List<Employee> FemaleEmployeesInEachDepartment(List<Employee> employeeList) {
//        return employeeList.stream()
//                .filter(e -> "FEMALE".equals(e.getEmployeeGender()))
//                .sorted(Comparator.comparingInt(Employee::getEmployeeSalary)
//                        .thenComparing(Employee::getEmployeeId))
//                .collect(Collectors.toList());
    	
    	return employeeList.stream()
    			.filter(e ->"FEMALE" .equals(e.getEmployeeGender()))
    			.sorted(Comparator.comparingInt(Employee::getEmployeeSalary)
    					.thenComparing(Employee::getEmployeeId))
    			.collect(Collectors.toList());
    }

    // TASK 2
    // Find the Employee that has highest salary in the given Department, 
    // if two employee has same salary, give preference to employeeId.
    public Optional<Employee> hasHighestSalaryInGivenDepartment(List<Employee> employeeList, String departmentName) {
        return employeeList.stream()
                .filter(e -> e.getDepartmentName().equals(departmentName))
                .max(Comparator.comparingInt(Employee::getEmployeeSalary)
                        .thenComparing(Employee::getEmployeeId).reversed());
    }

    // TASK 3
    // Find the Employee that works alone in their department
    public Optional<Employee> worksAloneInDepartment(List<Employee> employeeList) {
        Map<String, List<Employee>> departmentEmployees = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartmentName));

        return departmentEmployees.entrySet().stream()
                .filter(entry -> entry.getValue().size() == 1)
                .map(entry -> entry.getValue().get(0))
                .findFirst();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeeGender='" + employeeGender + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeAge=" + employeeAge +
                ", departmentName='" + departmentName + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }

    public Employee(int employeeId, String employeeName, String employeeEmail, String employeeGender, int employeeSalary, int employeeAge, String departmentName, int departmentId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeeGender = employeeGender;
        this.employeeSalary = employeeSalary;
        this.employeeAge = employeeAge;
        this.departmentName = departmentName;
        this.departmentId = departmentId;
    }

    public Employee() {
    }
}
	


