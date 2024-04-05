package multithreading;

public class ThreadDemo2 implements Runnable {
	public void run() {
		while (true) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo2 obj = new ThreadDemo2();
		Thread t1 = new Thread(obj);
		t1.setName("new 1");
		t1.start();

		Thread t2 = new Thread(obj);
		t2.setName("new 2");
		t2.start();

	}

}
