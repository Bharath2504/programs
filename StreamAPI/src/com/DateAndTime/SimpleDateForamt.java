package com.DateAndTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class SimpleDateForamt {

	public static void main(String[] args) throws ParseException {
		
		Date D= new Date();
		System.out.println(D);
		System.out.println("=========================================");
		//Covert Date To String
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/YYYY");
		String Foramt1 = sdf1.format(D);
		System.out.println(Foramt1);
		System.out.println("=========================================");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/YYYY");
		String Foramt2 = sdf1.format(D);
		System.out.println(Foramt2);
		System.out.println("=========================================");
		
		//Convert Date To String
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-mm-dd");
		Date pasedDate=sdf3.parse("2022-12-28");
		System.out.println(pasedDate);
		System.out.println("==============================================");
	}

}
