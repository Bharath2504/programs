package com.Collector;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorDemo1 {

	public static void main(String[] args) {
		
		Person p1 = new Person("Badri","NLG");
		Person p2 = new Person("Shiva","HYD");
		Person p3 = new Person("Kishore","MUB");
		Person p4 = new Person("Sai","GTR");
		Person p5 = new Person("Vishnu","NLG");
		
		List<Person> person = Arrays.asList(p1,p2,p3,p4,p5);
		
		//List<Person> Nlg = person.stream().filter(p -> p.country.endsWith("NLG")).collect(Collectors.toList());
		
		List<String> HYD = person.stream().filter(p-> p.country.equals("HYD")).map(p->p.name).collect(Collectors.toList());
		HYD.forEach(System.out::println);
		

	}

}
