package unit2.threads;

public class ThreadDemo1 implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		ThreadDemo1 t1 = new ThreadDemo1();
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t1);
		Thread th3 = new Thread(t1);
		th1.start();
		th2.start();
		th3.start();
		

	}

	

}
