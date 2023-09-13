package com.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringToDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String strDate= "25/04/1998";
		
		Date date= new SimpleDateFormat("dd/mm/yyyy").parse(strDate);
		
		System.out.println(strDate +""+date);

	}

}
