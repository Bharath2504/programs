package com.Enum;

public class EnumDay {
	Day day;
	public EnumDay(Day day) {this.day =day;}
	
	
	public void dayIsLike() {
		switch(day) {
		
		case MONDAY:
		System.out.println("monday is bad");
		break;
		
		case SATURDAY:
		System.out.println("Saturday is weekend");
		break;
		
		case SUNDAY:
		System.out.println("Sunday is fun day");
		break;
			
		default:
		System.out.println("weekends are good");
		break;
		}
	}
	
	public static void main(String[] args) {
		
		String s= "SUNDAY";
		EnumDay ed=new EnumDay(Day.valueOf(s));
		ed.dayIsLike();
		
		
		
		
		

	}

}
