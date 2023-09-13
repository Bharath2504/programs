package Exception;

public class Finally {

	public static void main(String[] args) {
		System.out.println("main method starting.....");
		try {
			System.out.println("try block starting.....");
			int a=10/2;
			System.out.println(a);
			System.out.println("try block ending.....");
		
		}catch(Exception e) {
			System.out.println("catch block 2.....");
			e.printStackTrace();
		}finally {
			System.out.println("fianlly block.....");
		}
		System.out.println("main method ending.....");
	}

}
