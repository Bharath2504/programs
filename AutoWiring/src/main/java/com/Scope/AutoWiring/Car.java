package com.Scope.AutoWiring;

public class Car {
	public Car() {
		System.out.println("Car class Constructor");
	}
	private DieselEngine dieselEngine;

public DieselEngine getDieselEngine() {
		return dieselEngine;
	}
	public void setDieselEngine(DieselEngine dieselEngine) {
		this.dieselEngine = dieselEngine;
	}

	public void  drive() {
		int result = dieselEngine.start();
		if (result>=1) {
			System.out.println("Car Started For Jourreny");
		}else {
			System.out.println("Engine has some problrm");
		}
	}
}