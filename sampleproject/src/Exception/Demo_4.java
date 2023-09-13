package Exception;

public class Demo_4 {

	public static void main(String[] args) {
		
		System.out.println("main () method started...");
		try {
			System.out.println("in catch block");
			String s="hi";
			int i=s.length();				
		}catch(Exception e) {
			System.out.println("catch block started");
			e.printStackTrace();
		}catch(NullPointerException ne) {
		System.out.println("catch second block");
		}
		System.out.println("main()method ending");
	}

}
