package Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers =(ArrayList<Integer>) Arrays.asList(1, 2, 3, 4, 5, 6);
		
		Predicate<Integer> isEven= num->num%2==0;
		
		List<Integer> OddNumbers= new ArrayList<>();
		
		for(Integer number:numbers) {
			if(!isEven.test(number)) {
				OddNumbers.add(number);
			}
			
		}
		System.out.println("Odd Number" + OddNumbers);
		
	}

}
