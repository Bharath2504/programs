package com.task2;

public class main {

	public static void main(String[] args) {
		
		Circle c=new Circle(5);
		Rectangle r= new Rectangle(5,15);
		Triangle t=  new Triangle(5,3);
		
		
		System.out.println("Circle");
		System.out.println("Area: " + c.calculateArea());
		System.out.println("Perimater :" +c.calculatePerimeter());
		
		System.out.println("Rectangle");
		System.out.println("Area; "+r.calculateArea());
		System.out.println("perimeter : "+ r.calculatePerimeter());
		
		System.out.println("Triangle");
		System.out.println("Area:"+ t.calculateArea());
		System.out.println("perimeter : "+ t.calculatePerimeter());
	}

}
