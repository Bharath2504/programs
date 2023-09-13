package com.employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class EmployeeStreem {

	public static void main(String[] args) {
	
		List<Employee> employeeList= new ArrayList<>();
		
		employeeList.add(new Employee (1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee (2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		employeeList.add(new Employee (3, "David", 29, "Male", "Infrastructure", 2012, 13000.0));
		employeeList.add(new Employee (4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new Employee (5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		employeeList.add(new Employee (6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		employeeList.add(new Employee (7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new Employee (8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new Employee (9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		employeeList.add(new Employee (10, "Mahesh", 38, "Male", "Security", 2015, 11000.0));
		employeeList.add(new Employee (11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee (12, "Nithin", 25, "Male", "Developer", 2016, 28200.0));
		employeeList.add(new Employee (13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		employeeList.add(new Employee (14, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee (15, "Ashok", 23, "Male", "Infrastructure", 2018, 1700.0));
		employeeList.add(new Employee (16, "Sanvi", 26, "Female", "Developer", 2015, 28900.0));
		
		
		
		//1.How many male female employee there in organization
		System.out.println("1.How many male female employee there in organization");
		
		Map<String, Long> maleFemale = employeeList.stream().collect(Collectors.groupingBy((Employee::getGender), Collectors.counting()));
		System.out.println(maleFemale);
		
		System.out.println("===========================================================================================================");
		
		//2.Write a java code to print all the departments in organization
		System.out.println("2.Write a java code to print all the deportments in organization");
		
		List<String> deportment = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
		System.out.println(deportment);
		
		System.out.println("===========================================================================================================");
		
		//3.write a java code to print avg age of male and female employee in the organization
		System.out.println("3.write a java code to print avg age of male and female employee in the organization");
		
		Map<String, Double> Average = employeeList.stream().collect(Collectors.groupingBy((Employee::getGender), Collectors.averagingDouble(Employee::getAge)));
		System.out.println(Average);
		
		System.out.println("===========================================================================================================");
		
		//4.Write a java code highest paid employee in the organization
		System.out.println("4.Write a java code highest paid employee in the organization");
		
		Optional<Employee> highestPaid = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println(highestPaid);
		
		System.out.println("===========================================================================================================");
		
		//5.Get all the employee who joined in 2015
		System.out.println("5.Get all the employee who joined in 2015");
		
		employeeList.stream().filter(e-> e.yearOfJoining >=2015).forEach(System.out::println);
		
		System.out.println("===========================================================================================================");
		
		//6.count num of employees in each department
		System.out.println("6.count num of employees in each department");
		
		Map<String, Long> NumOfEmployees = employeeList.stream().collect(Collectors.groupingBy((Employee::getDepartment),Collectors.counting()));
		System.out.println(NumOfEmployees);
		
		System.out.println("===========================================================================================================");
		
		//7.What is avg salary of the each departments
		System.out.println("7.What is avg salary of the each departments");
		Map<String, Double> AvgSalary = employeeList.stream().collect(Collectors.groupingBy((Employee::getDepartment),Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(AvgSalary);
		System.out.println("===========================================================================================================");
		
		//8.get the details of youngest male employee in development department
		System.out.println("8.get the details of youngest male employee in development department");
		Optional<Employee> YoungestEmployee = employeeList.stream().filter(i-> i.getGender()=="Male").filter( i->i.getDepartment()=="Development") .collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
		
		System.out.println(YoungestEmployee);
		
		System.out.println("===========================================================================================================");
		
		//9.Who is having most experience in the Organization
		System.out.println("9.Who is having most experience in the Organization");
		Optional<Employee> exp = employeeList.stream().collect((Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining))));
		if(exp.isPresent()) {
		System.out.println(exp.get());
		}
		System.out.println("===========================================================================================================");
			
		//10.how many male & female employee are there in the sales team
		System.out.println("10.how many male & female employee are there in the sales team");
		Map<String, Long> mp = employeeList.stream().filter(i-> i.getDepartment()=="Sales").collect(Collectors.groupingBy((Employee::getGender), Collectors.counting()));
		System.out.println(mp);
		System.out.println("===========================================================================================================");
		
		//11.What is the Average salary of male and female Employee
		System.out.println("11.What is the Average salary of male and female Employee");
		Map<String, Double> avgSalary = employeeList.stream().collect(Collectors.groupingBy((Employee::getGender), Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalary);
		System.out.println("===========================================================================================================");
		
		//12.List down the names of the all employees in each departments
		System.out.println("12.List down the names of the all employees in each departments");
		Map<String, List<String>> EmpNames = employeeList.stream().collect(Collectors.groupingBy((Employee::getDepartment), Collectors.mapping((Employee::getName), Collectors.toList())));
		System.out.println(EmpNames);
		System.out.println("===========================================================================================================");
		
		//13. Separate the Employee who are Younger or equal to 25 years  from those employees who are older than 25 years 
		System.out.println("13.Separate the Employee who are Younger or equal to 25 years  from those employees who are older than 25 years ");
		List<String> empAGE = employeeList.stream().filter(e->e.getAge()<=25).map(Employee::getName).collect(Collectors.toList());
		System.out.println(empAGE);
		System.out.println("===========================================================================================================");
		
		//14.Who is the oldest employee in Organization.
		System.out.println("14.Who is the oldest employee in Organization");
		Optional<Employee> OldestEmployee = employeeList.stream().collect((Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining))));
		System.out.println(OldestEmployee);
		System.out.println("===========================================================================================================");
		
		//15.What is average salary and Total salary of whole organization.
		System.out.println("15.What is average salary and Total salary of whole organization");
		OptionalDouble average2 = employeeList.stream().mapToDouble(e->e.getSalary()).average();
		System.out.println("Avaerage Salary OF the Organization; "+average2);
		double average3 = employeeList.stream().mapToDouble(e->e.getSalary()).sum();
		System.out.println("Total salarys of the organization; "+average3);
		System.out.println("===========================================================================================================");
		
		//16.Find second Highest salaried Employee in the Organization.
		System.out.println("16.Who is the oldest employee in Organization");
		Optional<Employee> SecondHighestSalaray = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
		System.out.println(SecondHighestSalaray);
		System.out.println("===========================================================================================================");
		
	}

}
