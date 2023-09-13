package com.task3;

public class main {

	public static void main(String[] args) {
		
		Circle c = new Circle(10);
		Rectangle r = new Rectangle(8,10);
		Triangle t=new Triangle(9,8);
		
		System.out.println("Circle");
		System.out.println("Circle area:" +c.getArea());
		
		System.out.println("Rectangle");
		System.out.println("Rectanle area :" + r.getArea());
		
		System.out.println("Triangle");
		System.out.println("Triangle area: "+ t.getArea());
	}

}
