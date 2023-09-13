package Exception;

public class Demo_1 {

	public static void main(String[] args) {
		
		System.out.println("main() method started...");
		
		try {
			String s=null;
			s.length();
			System.out.println("try block end");
		}catch(Exception e) {
			System.out.println("in catch block");
			e.printStackTrace();
		}
	
		System.out.println("main()method ended");
	}

}
