package com.scope.Maven_Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.FirstSample.BillCollector;

public class test {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("badri.xml");
		
		
		Car c = context.getBean("car",Car.class);
		System.out.println(c.hashCode());
		
		Car c1 = context.getBean("car",Car.class);
		System.out.println(c1.hashCode());
		
	}

}

 