package TreeSet;
import java.util.Comaparator;
import java.util.TreeSet;

public class Comparator {

	public static void main(String[] args) {
		
		TreeSet<StringBuffer> t = new TreeSet<>(MyComparator());
		
		t.add(new StringBuffer ("A"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("D"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("a"));
		
		System.out.println("TreeSet" + t);

	}

}
class MyComparator implements Comparator<Object>{
	
	public int comparator (Object obj1,Object obj2) {
		
		String s1=obj1.toString();
		String s2=obj2.toString();
	}
	
}