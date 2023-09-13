package com.Filter;

import java.util.stream.Stream;

public class FilterDemo_3 {

	public static void main(String[] args) {
		
		User u1 = new User("Shiva",25);
		User u2 = new User("Kishore",20);
		User u3 = new User("Shilpa",21);
		User u4 = new User("Siri",22);
		User u5 = new User("Badri",19);
		
		Stream<User> stream= Stream.of(u1,u2,u3,u4,u5);
		
		//stream.filter(u->u.age>18).forEach(u->System.out.println(u));
		
		//stream.filter(u->u.age>=18&&u.name.startsWith("S")).forEach(u->System.out.println(u));
		
		stream.filter(u->u.age>=18)
		.filter(u->u.name.startsWith("S"))
		.forEach(u->System.out.println(u));
	}

}
