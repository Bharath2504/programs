package Predicate;

import java.util.function.Predicate;

public class Predictae_1 {

	public static void main(String[] args) {
		
		Predicate<Integer> lessthan= i->(i<18);
		
		System.out.println(lessthan.test(17));

	}

}
