package Predicate;

import java.util.function.Predicate;

public class Example_2 {

	public static void main(String[] args) {
		
		String[] names= {"Shiva","Badri","Shilpa","Kishore","Mani","Siri"};
	
		Predicate<String> p= name -> name.startsWith("S");
		
		for(String name : names) {
			if(p.test(name)) {
				System.out.println(name);
			}
		}
	}

}
