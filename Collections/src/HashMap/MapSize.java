package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapSize {

	public static void main(String[] args) {
		
		HashMap<Integer,String> m = new HashMap<>();
		
		m.put(1, "badri");
		m.put(2, "sai");
		m.put(3, "shiva");
		m.put(4, "kishore");
		
		
		System.out.println("Size of the hash map :" + m.size());
		
		
	}

}
