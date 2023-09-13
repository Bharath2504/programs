package com.Collector;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorDemo2 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"badri",25000.00);
		Employee e2 = new Employee(2,"Shiva",20000.00);
		Employee e3 = new Employee(3,"Kishore",21000.00);
		Employee e4 = new Employee(4,"Sai",18000.00);
		Employee e5 = new Employee(5,"Vishnu",23000.00);
		
		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5);
		
		Optional<Employee> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
		System.out.println("Max salary::" + max.get().salary);
		
		Optional<Employee> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary)));
		System.out.println("Min salary::" + min.get().salary);
		
		Double avgSalary = list.stream().collect(Collectors.averagingDouble(e->e.salary));
		System.out.println("AvgSalary ;-" +avgSalary);
		
		
		
	}

}
