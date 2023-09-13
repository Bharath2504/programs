package HashMap;

import java.util.HashMap;

import javax.print.DocFlavor.STRING;

public class Clone {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		
		map.put(1, "Dhoni");
		map.put(2, "Virat");
		map.put(3, "Rohit");
		
		HashMap<Integer,String> NEW = new HashMap<Integer,String>();
		
		NEW.putAll(map);
		
		System.out.println(NEW);

	}

}
