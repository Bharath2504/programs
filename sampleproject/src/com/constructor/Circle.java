package com.constructor;

public class Circle {
	
	private double radius;
	private double area;
	
	public Circle() {
		radius =0;
		area=0;
	}
	
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
		
	}
	
public static void main(String[] args) {
	
	double radius=6;
	Circle c=new Circle(radius);
	double area=c.getArea();
	
	System.out.println("The area of the circle is:"
	+ area);

}

}

