package com.Method;

public class FindSmallestNumberInTheString {

	static double snum=0;
	
	public static void main(String[] args) {
		
		double x=50;
		double y=25;
		double z=45;
		double d=SmallNum(x,y,z);
		System.out.println("Smallest num is:-" +d);
	}
	static double SmallNum(double x,double y,double z) {
		
		if(x>y) {
			if (y>z) {
				snum=z;
		}
			else 
			{
				snum=y;
			}
		}
			else
			{
				if(x<z) {
				snum =x;	
				
			}
				else	
				{
					snum =z;
			}
	return snum;
}
		return snum;
}
}