package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class pesonExample1 {

	public static void main(String[] args) {
		
		List<Person1> P= new ArrayList<>();
		
		P.add(new Person1("Badri",24));
		P.add(new Person1("shiva",23));
		P.add(new Person1("bharath",15));
		P.add(new Person1("vishnu",35));
		
		Predicate<Person1> isAdult = Person1 -> Person1.age >=18;
		
		List<Person1> adults= new ArrayList<>();
		for(Person1 Person:P) {
			if(isAdult.test(Person)) {
				adults.add(Person);
			}
			
		}
		
		System.out.println("Adults :" + adults);
	}

}
