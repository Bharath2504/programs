package com.task2;

public class Circle extends shape {

	private double radius;
	
	
	public Circle (double radius) {
		this.radius=radius;
	}

	public double calculateArea() {
		return  Math.PI*radius*radius;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius*radius;
	}
	
	
}
