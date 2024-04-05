package multithreading;

public class ThreadDemo extends Thread {
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getName());
			
		}
	}

	public static void main(String[] args) {
			ThreadDemo t1 = new ThreadDemo();
			t1.setName("New Thread1");
			t1.start();
			
			ThreadDemo t2 = new ThreadDemo();
			t2.setName("New Thread2");
			t2.start();
	}

}
