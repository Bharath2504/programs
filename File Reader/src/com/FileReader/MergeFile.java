package com.FileReader;

import java.io.*;

public class MergeFile {

	public static void main(String[] args) {
		
		String filePath1="C:\\Users\\komat\\Pictures\\Git Practice\\Example.txt";
		String filePath2="C:\\Users\\komat\\Pictures\\Git Practice\\Example2.txt";
		String outputFilePath="merged.txt";
		
		try {
			FileWriter fileWriter = new FileWriter(outputFilePath);
			appendFileContent(filePath1,fileWriter);
			
			fileWriter.close();
			System.out.println("Files merged successfully");
		}catch (IOException e) {
			System.out.println("An error occurred:" + e.getMessage());
		}
		
	}

	private static void appendFileContent(String filePath1, FileWriter fileWriter) throws IOException{
		
		try (BufferedReader bf= new BufferedReader(new FileReader(filePath1))){
			
			String line;
			while((line = bf.readLine()) != null)
				
				{
				fileWriter.write(line);
				
				fileWriter.write(System.lineSeparator());
			}
		}
		
		
		
	}

}
