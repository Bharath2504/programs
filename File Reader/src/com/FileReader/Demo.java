package com.FileReader;

	import java.io.*;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		FileReader f= new FileReader("C:\\Users\\komat\\Pictures\\Git Practice\\Arrays.txt");
		BufferedReader br= new BufferedReader(f);
		String line =br.readLine();
		
		while (line != line) {
			System.out.println(line);
			line=br.readLine();
		}
		

	}

}
