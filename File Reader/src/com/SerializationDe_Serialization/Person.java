package com.SerializationDe_Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int id;
	String name;
	
	public static void main(String[] args) throws Exception {
		
		Person p=new Person();
		p.id=100;
		p.name="badri";
		
		System.out.println("....Serialization started.....");
		
		FileOutputStream fos= new FileOutputStream("badri.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.flush();
		oos.close();
		
		System.out.println("......Serialization completed......");
		
		System.out.println("......De Serialization started.......");
		
		FileInputStream fis= new FileInputStream("badri.ser");
		ObjectInputStream ois =new ObjectInputStream(fis);
		Object obj= ois.readObject();	
		Person p1=(Person) obj;
		
		System.out.println("id:" +p1.name);
		System.out.println("name:" +p1.name);
		ois.close();
		
		
		System.out.println("......DeSerialization Ended......");
		
		
		
	}
	
	
}

	