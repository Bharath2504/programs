package com.Task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.Collector.Employee;

public class StudentDemo1 {

	public static void main(String[] args) {
		
				List<Student> students = Arrays.asList(
			    new Student("Alice", Arrays.asList(85.0, 92.5, 78.0)),
			    new Student("Bob", Arrays.asList(90.0, 88.5, 92.0)),
			    new Student("Charlie", Arrays.asList(76.5, 84.0, 88.0)));
				
				Map<Object, List<Student>> grade = students.stream().collect(Collectors.groupingBy(s -> s.getGrades()));
		
				System.out.println(grade);
				
				Double collect = students.stream().collect(Collectors.averagingDouble(s -> s.getName()));
				
			
				
		
	}

}
