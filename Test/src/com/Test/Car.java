package com.Test;

public class Car extends Engine {

	public void drive () {
		
		int result = super.start();
		
		if(result>=1) {
			System.out.println("Journey stataed succssefully");
		}else {
			System.out.println("Engine has some problem");
		}
		
	}

}
