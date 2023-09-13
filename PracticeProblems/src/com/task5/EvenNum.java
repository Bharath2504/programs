package com.task5;

public class EvenNum implements Runnable {
	
	
	private int maxValue = 50;
	
	public EvenNum(int maxValue) {
		this.maxValue=maxValue;
	}

	@Override
	public void run() {
		for (int i=0;i<=50;i+=2) {
			System.out.println(i);
		}
		
	}

}
