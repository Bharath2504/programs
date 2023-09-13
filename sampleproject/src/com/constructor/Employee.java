package com.constructor;

public class Employee {

	String name;
	float salary;
	
	public Employee(String name,float salary) {
		
		this.name=name;
		this.salary=salary;
		
		System.out.println(this.name+"--"+this.salary);
	}
	
	public static void main(String[] args) {
		
		Employee emp=new Employee("mahesh",40000.00f);
	}

}
