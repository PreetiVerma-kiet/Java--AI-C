package unit2.threads;
public class ThreadLifeCycleDemo extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("the thread is running..");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadLifeCycleDemo t1 = new ThreadLifeCycleDemo();
		System.out.println("the state of the thread is" + t1.getState());  // new
		t1.start();
		System.out.println("the state of the thread is" + t1.getState()); // Runnable
		Thread.sleep(1000);
		System.out.println("the state of the thread is" + t1.getState());  //
		t1.join();
		System.out.println("the state of the thread is" + t1.getState());

	}

}
