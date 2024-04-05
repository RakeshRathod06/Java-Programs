package multithreading;

class Printable {
	public void print(int n) {
//		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i * n);
			}
		}
	}


class Thread1 extends Thread {
	Printable printable;

	public Thread1(Printable printable) {
		this.printable = printable;
	}

	public void run() {
		printable.print(5);
	}
}

class Thread2 extends Thread {
	Printable printable;

	public Thread2(Printable printable) {
		this.printable = printable;
	}

	public void run() {
		printable.print(4);
	}
}

public class SynchronizationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable printable = new Printable();
		Thread1 t1 = new Thread1(printable);
		Thread2 t2 = new Thread2(printable);
		t1.start();
		t2.start();

	}

}
