package com.FileReader;

import java.io.*;

public class Read {

	public static void main(String[] args) throws IOException {
		
		FileReader f= new FileReader("C:\\Users\\komat\\Pictures\\Git Practice\\Arrays.txt");
		int i= f.read();
		
		while(i !=-1) {
			System.out.print((char )i);
			i=f.read();
		}
		
		f.close();
	}

}
