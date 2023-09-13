package com.FileReader;

import java.io.*;

public class write {

	public static void main(String[] args) throws IOException {
		
		FileWriter f= new FileWriter("C:\\Users\\komat\\Pictures\\Git Practice\\Example.txt");
		f.write("hi");
		f.write("\n");
		f.write("hello");
		f.flush();
		f.close();
		

	}

}
