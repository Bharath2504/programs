package com.scope.Maven_Scope;

public class Car {
	
	public Car() {
		System.out.println("Car Class Consturctor  ");
	}
	public DieselEngine dieselEngine;
	
	
	public DieselEngine getDieselEngine() {
		return dieselEngine;
	}


	public void setDieselEngine(DieselEngine dieselEngine) {
		this.dieselEngine = dieselEngine;
	}


	public void drive() {
		int result = dieselEngine.start();
		if (result>=1) {
			System.out.println("Car started for journey");
		}else {
			System.out.println("Engine has some problem");
		}
	}
}
