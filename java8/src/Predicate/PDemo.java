package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("badri",24);
		Person p2 = new Person("shiva",24);
		Person p3 = new Person("kishore",20);
		
		List<Person> PDemo =Arrays.asList(p1,p2,p3);
		
		Predicate<Person> Predicate = p -> p.age >=21;
		 for(Person Person : PDemo) {
			 if(Predicate.test(Person)) {
				 
				 System.out.println(Person.name);
			 }
		 }
	}

}
