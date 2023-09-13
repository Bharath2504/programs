package Exception;

public class PracticeException {

	public static void main(String[] args) {
		System.out.println("main method starting.....");
		try {
			System.out.println("try block starting.....");
			int k=5/0;
			System.out.println("try block ending.....");
		}catch(ArithmeticException e) {
			
			System.out.println("ArithmeticException=>"+e.getMessage());
		}finally {
			System.out.println("finally block.....");
		}

	}

}
