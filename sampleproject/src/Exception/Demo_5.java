package Exception;

public class Demo_5 {

	public static void main(String[] args) {
		
		System.out.println("main()method starting...");
		try {
			System.out.println("try bolck starting");
			int i=10/2;
			System.out.println(i);
			System.out.println("try bolck ending");
		}catch(Exception e) {
			System.out.println("catch bolck starting");
			e.printStackTrace();
		}finally {
			System.out.println("finaly blocked");
		}

		System.out.println("main()method ending");
	}

}
