package Predicate;

import java.util.function.Predicate;

public class Example_1 {
	
	public static void main(String[] args) {
		
		
		Predicate<Integer> p =i->i>10;
		System.out.println(p.test(5));
		System.err.println(p.test(15));
		
	}

}
