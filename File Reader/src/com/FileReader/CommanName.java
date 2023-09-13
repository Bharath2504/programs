package com.FileReader;

import java.io.*;
import java.util.*;

public class CommanName {

	public static void main(String[] args) {
	
		Set<String> namesFromFile1 = readNamesFromFile("C:\\Users\\komat\\Pictures\\Git Practice\\Example.txt");
		Set<String> namesFromFile2 = readNamesFromFile("D:\\JAVA 24\\JAVA WORK PLACE\\File Reader\\Example.txt");

		namesFromFile1.retainAll(namesFromFile2);
		
		System.out.println("Commen Names ");
		namesFromFile1.forEach(System.out::println);
	}

	private static Set<String> readNamesFromFile(String filepath) {
		Set <String> name = new HashSet<>();
		
		try(BufferedReader bf= new BufferedReader(new FileReader(filepath))){
			bf.lines().forEach(name::add);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return name;
	}

}
