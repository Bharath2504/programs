package com.Transient;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Person Object = null;
	
	int id;
	String name;
	String email;
	transient String password;
	
	public static void main(String[] args) throws Exception{
		
		Person p= new Person();
		p.id=100;
		p.name="badri";
		p.email="badribharath2504@gmail.com";
		p.password="b@dri2504";
		
		System.out.println(".......Serialization started......");
		
		FileOutputStream fos= new FileOutputStream("bharathwaj.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.flush();
		oos.close();
		
		System.out.println(".....Serialization completed.....");
		
		System.out.println(".....DeSerialization Started.....");
		
		FileInputStream fis = new FileInputStream("bharathwaj.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Object obj= ois.readObject();
		Person p1 = (Person) obj;
		System.out.println("id :"+ p1.id);
		System.out.println("Name:"+ p1.name);
		System.out.println("Email:" +p1.email);
		System.out.println("Password:"+ p1.password);
		ois.close();
		
		System.out.println(".....DeSerialization Ended.....");
		
	}

}