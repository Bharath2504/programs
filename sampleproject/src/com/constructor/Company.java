package com.constructor;

public class Company {
	
		int id;
		String name;
		String year;
		
		public Company(String year,String name,int id) {
			
			this.id=id;
			this.name=name;
			this.year=year;
			
			System.out.println(this.id+" "+this.name+" "+this.year);
		}

	public static void main(String[] args) {
		Company cm= new Company("1952","MRF",214856);

	}

}
