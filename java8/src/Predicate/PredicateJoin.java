package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	
	String name;
	String location;
	String dept;
	
	 Employee(String name,String location, String dept){
		this.name=name;
		this.location=location;
		this.dept=dept;
	}

}


public class PredicateJoin {

	public static void main(String[] args) {
		Employee e1=new Employee("Bharath","Nlg","Java");
		Employee e2=new Employee("Shiva","Hyd","Dev");
		Employee e3=new Employee("Kishore","Hyd","Dev");
		Employee e4=new Employee("Sai","Mlg","Db");
		
		List<Employee> emps=Arrays.asList(e1,e2,e3,e4);
		
		Predicate<Employee> p1 = (e) -> e.location.equals("Hyd");
		Predicate<Employee> p2 = (e)  -> e.dept.equals("Dev");
		Predicate<Employee> p3 = (e)  -> e.name.equals("S");
		
		Predicate<Employee> p = p1.and(p2).and(p3);
		
		for (Employee e : emps) {
			if(p.test(e)){
				
				System.out.println(e.name);
				
			}
		}
	}

}
