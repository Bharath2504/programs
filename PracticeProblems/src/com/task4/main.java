package com.task4;

public class main {

	public static void main(String[] args) {
		
		Vehicle v= new Vehicle();
		Car c= new Car();
		Bike b= new Bike();
		
		v.speedUp();
		c.speedUp();
		b.speedUp();
		
		System.out.println("Vehicle speed:" +v.getSpeed());
		System.out.println("Car of the vehicle:" +c.getSpeed());
		System.out.println("Bike of the vehicle:" +b.getSpeed());
	}

}
