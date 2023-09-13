package com.FileReader;

import java.io.*;

public class CreateNew {
	
	public static void main(String[] args) throws IOException {
		
		File f= new File ("bharath.txt");
		boolean fstatus = f.createNewFile();
		System.out.println(fstatus);
		
		
	}

}
