package com.Student;

import java.util.*;
import java.util.stream.Collectors;

public class StudentDemo {

	public static void main(String[] args) {
		
		List<Student> studentList= new ArrayList<>();
		
		studentList.add(new Student (1, "Badri", 24, "Male", "MECH", 2011));
		studentList.add(new Student (2, "Shiva", 24, "Male", "B.COM", 2015));
		studentList.add(new Student (3, "Kishore", 22, "Male", "EEE", 2012));
		studentList.add(new Student (4, "Sai", 18, "Male", "DIPLOMA", 2014));
		studentList.add(new Student (5, "Vishnavi", 23, "Female", "B.COM", 2013));
		studentList.add(new Student (6, "Narsimha", 26, "Male", "B.COM", 2016));
		studentList.add(new Student (7, "Nikhitha", 24, "Male", "MPC", 2010));
		studentList.add(new Student (8, "Venky", 26, "Male", "HEC", 2015));
		studentList.add(new Student (9, "Rani", 20, "Female", "COMPUTERS", 2016));
		studentList.add(new Student (10, "Nani", 20, "Male", "COMPUTERS", 2015));
		studentList.add(new Student (11, "Bhanu", 19, "Female", "MPC", 2014));
		studentList.add(new Student (12, "Thimma", 18, "Male", "MPC", 2016));
		studentList.add(new Student (13, "Aids-wanth", 18, "Male", "DIPLOMA", 2013));
		studentList.add(new Student (14, "Maheshwari", 17, "Female", "MPC", 2014));
		studentList.add(new Student (15, "Siri", 17, "Female", "MBBS", 2018));
		studentList.add(new Student (16, "Sreelela", 16, "Female", "MBBS", 2015));
		
		//1.How many male and female students in the list
		Map<String, Long> Gender = studentList.stream().collect(Collectors.groupingBy((Student::getGender),Collectors.counting()));
		System.out.println(Gender);
		System.out.println("....................................................................................");
		
		//2. print all the departments in organization
		Map<String, Long> Departments = studentList.stream().collect(Collectors.groupingBy((Student::getDepartment),Collectors.counting()));
		System.out.println(Departments);
		System.out.println("....................................................................................");
		
		//3.Average age of male and female students 
		Map<String, Double> AvgAge = studentList.stream().collect(Collectors.groupingBy((Student::getGender),Collectors.averagingDouble(Student::getAge)));
		System.out.println(AvgAge);
		System.out.println("....................................................................................");
		
		//4.who joined in 2016...?
		studentList.stream().filter(s->s.yearOfJoining >=2016).forEach(System.out::println);
		System.out.println("....................................................................................");
		
		//5.count number of students in each department
		Map<String, Long> collect = studentList.stream().collect(Collectors.groupingBy((Student::getDepartment),Collectors.counting()));
		System.out.println(collect);
		System.out.println("....................................................................................");
		
		//6.get the details of youngest male employee in development department
		Optional<Student> youngest = studentList.stream().filter(x->x.getGender()=="Male").filter(x->x.getDepartment()=="Department").collect(Collectors.minBy(Comparator.comparing(Student::getAge)));
		System.out.println(youngest);
		System.out.println("....................................................................................");
		
		//7.Year of joining of the student
		Optional<Student> YearOfJoining = studentList.stream().collect(Collectors.minBy(Comparator.comparing(Student::getYearOfJoining)));
		System.out.println(YearOfJoining);
		System.out.println("....................................................................................");
		
		//8.List the names of the students
		 Map<String, Long> NamesOfTheStudents = studentList.stream().collect(Collectors.groupingBy((Student::getName),Collectors.counting()));
		System.out.println(NamesOfTheStudents);
		System.out.println("....................................................................................");
		
		//.9 who is older then 25
		List<String> collect2 = studentList.stream().filter(e-> e.getAge()>=25).map(Student::getName).collect(Collectors.toList());
		System.out.println(collect2);
		System.out.println("....................................................................................");
		
		//10.who is older in the list
		Optional<Student> collect3 = studentList.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getAge)));
		System.out.println(collect3);
		System.out.println("....................................................................................");
		 
		//11.Second aged Student in college
		Optional<Student> findFirst = studentList.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).skip(1).findFirst();
		System.out.println(findFirst);
		
	}

}
