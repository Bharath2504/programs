import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		
		al.add(new Student(101,"badri",24));
		al.add(new Student(104,"shiva",23));
		al.add(new Student(103,"kishore",22));
		
		Collections.sort(al);
		for(Student st:al)
		
		
		System.out.println(st.rollno+ "" +st.name+ ""+st.age);
		
	}

}
