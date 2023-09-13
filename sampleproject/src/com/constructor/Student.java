package com.constructor;

public class Student {

	
		int id;
		String name;
		String age;
		String gender;
		
		public Student(int id,String name,String string,String gender) {
			this.id=id;
			this.name=name;
			this.age=string;
			this.gender=gender;
			
			System.out.println(this.id+" "+this.name+" "+this.age+" "+this.gender+" ");
		}
	public static void main(String[] args) {
		
		Student s1= new Student(1,"Saicheran","15","Male");
		Student s2=new Student (2,"mani harika","12","Female");
	}

}
