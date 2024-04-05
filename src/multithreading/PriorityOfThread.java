package multithreading;

public class PriorityOfThread extends Thread {
	public void run() {
		System.out.println("Thread Name: " + getName() + " Thread Priority: " + getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityOfThread t1 = new PriorityOfThread();
		PriorityOfThread t2 = new PriorityOfThread();
		t1.setName("Sukanya");
		t2.setName("Suraj");
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t1.start();
		t2.start();
	}

}
