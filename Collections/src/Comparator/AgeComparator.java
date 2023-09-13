package Comparator;

import java.util.Comparator;
import java.util.*;

public class AgeComparator implements Comparator<Student>{

	public static void main(String[] args) {
	
		ArrayList<Student> al=new ArrayList<>();  
		al.add(new Student("Vijay",101,23));  
		al.add(new Student("Ajay",106,27));  
		al.add(new Student("Jai",105,21));  
		
		

	}

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.age==s2.age)
		return 0;
		else if(s1.age>s2.age)
		return 1;
		else 
		return -1;
		
	}

}
