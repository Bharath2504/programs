package HashMap;

import java.util.*;

public class MyMap extends Thread{
	
	static Map <Integer,String> m= new HashMap<>();
	public void run() {
		
		m.put(4, "Badri");
		m.put(5, "Shiva");
		m.put(6, "Kishore");
		m.put(7, "Sai");
		
		try {
			Thread.sleep(1500);
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread() + "updated List" +m);
	}
	public static void main(String[] args)throws InterruptedException {
		
		System.out.println(Thread.currentThread() +"updating map");
		
		MyMap t1=new MyMap();
		t1.start();
		Map<Integer , String> mymap= Collections.synchronizedMap(m);
		
		mymap.put(1, "Kitamma");
		mymap.put(2, "Siri");
		mymap.put(3, "Mani");
		
		Set s1=mymap.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext()){
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+ "..." + m1.getValue() +"...");
			Thread.sleep(500);
		}
	}
} 
