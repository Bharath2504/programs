package Exception;

public class Demo_6 {

	public static void main(String[] args) {
		System.out.println("main() method staring");
		try {
			System.out.println("try bolck starting");
			int i=10/0;
			System.out.println(i);
			System.out.println("try bolck ending");
		}finally {
			System.out.println("fianlly block");
		}
		
		System.out.println("main() method ending");
	}

}
