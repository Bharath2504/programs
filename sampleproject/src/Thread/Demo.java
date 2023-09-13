package Thread;

public class Demo extends Thread{
	
	public void run() {
		System.out.println("Thread starting ");
	
	}



	public static void main (String[]args) {
		
		Demo d= new Demo ();
		d.start();
	}

}