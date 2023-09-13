package com.task2;

public class Triangle extends shape{
	
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base=base;
		this.height=height;
	}

	@Override
	public double calculateArea() {
		
		return 0.5*base*height;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*0.5*base*height;
	}

}
