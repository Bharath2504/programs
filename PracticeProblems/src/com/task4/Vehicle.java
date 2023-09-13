package com.task4;

public class Vehicle {
	
	protected int speed;
	
	public void speedUp() {
		
		System.out.println("speed of the vehicle");
		speed +=10;
	}

	
	public int getSpeed() {
		return speed;
		
	}
}
