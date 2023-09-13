package com.constructor;

public class Car {

		private String brand;
		private String colour;
		private int year;
		
		public Car (String brand,String colour,int year) {
		this.brand=brand;
		this.colour=colour;
		this.year=year;
		}
		
		//Getter method 
		public String getBrand() {
			return brand;
			
		}
		public String getColour() {
			return colour;
			
		}
		public int getYear() {
			return year;
			
		}
		
		//Setter method 
		public void setBrand(String brand) {
			this.brand=brand;
			
		}
		public void setColour(String colour) {
			this.colour=colour;
			
		}
		public void setYear(int year) {
			this.year=year;
		}
		
	public static void main(String[] args) {
		
		Car c = new Car("BMW","BLACK",2023);
		
		System.out.println("Brand ;"+ c.getBrand());
		System.out.println("Colour;" +c.getColour());
		System.out.println("Year ;" +c.getYear());
		
		
		
		
	}

}
