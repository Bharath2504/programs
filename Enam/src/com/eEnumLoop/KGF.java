package com.eEnumLoop;

public class KGF {

	public static void main(String[] args) {
		
		Color bad=Color.BLACK;
		
		switch(bad) {
		case RED:
			System.out.println("Red is observed");
			break;
		case BLUE:
			System.out.println("Blue is observed");
			break;
		case WHITE:
			System.out.println("White is observed");
			break;
		case BLACK:
			System.out.println("Black is observed");
			break;	
			
		default:
			System.out.println("other colors are observed");
		}
	}

}
