package Exception;

public class Demo_3 {

	public static void main(String[] args) {
		
		System.out.println("main ()method stated");
		
		try {
			System.out.println("try block start");
			String s="hi";
			s.length();
			System.out.println("try block ending");
		}catch(ArithmeticException e) {
			System.out.println("in catch block");
			e.printStackTrace();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();	
	}

		System.out.println("main() method...");
}
}