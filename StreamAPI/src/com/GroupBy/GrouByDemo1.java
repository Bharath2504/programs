package com.GroupBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrouByDemo1 {

	public static void main(String[] args) {
		
			Employee e1 = new Employee(1,"Bharath",24000.00,"NLG");
			Employee e2 = new Employee(2,"Shiva",25000.00,"HYD");
			Employee e3 = new Employee(3,"Kishore",21000.00,"MUB");
			Employee e4 = new Employee(4,"Sai",22000.00,"USA");
			
			List<Employee> list = Arrays.asList(e1,e2,e3,e4);
			
			Map<String, List<Employee>> data= list.stream().collect(Collectors.groupingBy(e->e.name));
			
			System.out.println(data);
	}

}
