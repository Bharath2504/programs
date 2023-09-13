package com.Collector;

public class Person {
	
	String name;
	String country;

	public Person(String name, String country) {
		super();
		this.name = name;
		this.country = country;
		
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}
	
}
