package com.FileReader;

import java.io.*;

public class King {

	public static void main(String[] args) {
		
		String filePath ="C:\\\\Users\\\\komat\\\\Pictures\\\\Git Practice\\\\Example.txt";
		
		try (BufferedReader bf= new BufferedReader(new FileReader(filePath))){
			
			int charCount=0,wordCount=0,lineCount=0;
			
			String line;
			
			try {
				while ((line = bf.readLine()) != null) {
					
					lineCount++;
					
					charCount += line.length();
					
					wordCount += line.split("\\s+").length;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Number of characters:" + charCount);
			
			System.out.println("Number of characters:" + wordCount);
			
			System.out.println("Number of characters:" + lineCount);
		} catch (IOException e) {
			System.out.println("An error occurred:" +e.getMessage());
			
		}
		
	}

}
