package com.DateAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class NewDateDemo {

	public static void main(String[] args) {
		 
		LocalDate of= LocalDate.of(2021, 2, 18);
		System.out.println(of);
		System.out.println("===============================");
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println("===============================");
		
		date = date.plusDays(3);
		System.out.println(date);
		System.out.println("===============================");
		
		date = date.plusMonths(1);
		System.out.println(date);
		System.out.println("===============================");
		
		date = date.plusWeeks(5);
		System.out.println(date);
		System.out.println("===============================");
		
		date = date.plusYears(2);
		System.out.println(date);
		System.out.println("===============================");
		
		//To Check LeapYear
		boolean leapYear = LocalDate.parse("2020-12-22").isLeapYear();
		System.out.println(leapYear);
		System.out.println("===============================");
		
		boolean before = LocalDate.parse("2021-12-25").isBefore(LocalDate.parse("2022-11-14"));
		System.out.println(before);
		System.out.println("===============================");
				
		//Local Time
		LocalTime time =  LocalTime.now();
		System.out.println(time);
		System.out.println("===============================");
		
		time = time.plusHours(5);
		System.out.println(time);
		System.out.println("===============================");
		
		LocalDateTime DT = LocalDateTime.now();
		System.out.println(DT);
		System.out.println("===============================");
		
		Period period =Period.between(LocalDate.parse("1998-04-25"), LocalDate.now());
		System.out.println(period);
		System.out.println("===============================");
		
		Duration duration = Duration.between(LocalTime.parse("01:00"),LocalTime.now());
		System.out.println(duration);
		System.out.println("===============================");
		
	}

}
