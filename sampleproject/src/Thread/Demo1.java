package Thread;

public class Demo1 implements Runnable {
	
		public void run() {
			System.out.println("run() method started..." + Thread.currentThread().getName());
			try {
				Thread.sleep(1500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("run() method ending ...." + Thread.currentThread().getName());
		}


	public static void main1(String[] args) {
		
		Demo1 d=new Demo1();

		Thread t1=new Thread(d);
		t1.setPriority(10);
		t1.setName("Thread 1");
		
		Thread t2=new Thread(d);
		t1.setPriority(5);
		t1.setName("Thread 2");
		
		Thread t3=new Thread(d);
		t1.setPriority(3);
		t1.setName("Thread 2");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}

	public static void main (String...strings) {
		
	}
