package Exception;

public class FinallyBlock_2 {

	public static void main(String[] args) {
		System.out.println("main method starting.....");
		try {
			System.out.println("try block starting.....");
			int a=5*6;
			int b=99+1;
			System.out.println(a);
			System.out.println(b);
			System.out.println(a-b);
			System.out.println("try block ending.....");
		}catch(Exception e){
			System.out.println("catch block .....");
			e.printStackTrace();
		}finally {
			System.out.println("finally block.....");
		}
		System.out.println("main method ending.....");
	}

}
