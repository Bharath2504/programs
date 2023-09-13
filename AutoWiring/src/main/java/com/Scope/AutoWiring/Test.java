package com.Scope.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("auto.xml");
		
		Car c1 = context.getBean("car",Car.class);
		System.out.println(c1.hashCode());
		
		Car c2 = context.getBean("car",Car.class);
		System.out.println(c2.hashCode());

	}

}
