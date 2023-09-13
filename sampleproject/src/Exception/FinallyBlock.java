package Exception;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("main method starting.....");
		try {
			System.out.println("try block starting.....");
			int a=10/0;
			System.out.println("try block ending.....");
		}finally {
			System.out.println("finally block.....");
		}
		System.out.println("main method ending.....");
	}

}
