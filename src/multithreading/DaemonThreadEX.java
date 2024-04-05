package multithreading;

public class DaemonThreadEX extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println(getName()+" Which is Daemon Thread Works....!");
		} else {
			System.out.println(getName()+" Works.....!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThreadEX t1 = new DaemonThreadEX();
		DaemonThreadEX t2 = new DaemonThreadEX();
		DaemonThreadEX t3 = new DaemonThreadEX();

		t1.setDaemon(true);

		t1.start();
		t2.start();
		t3.start();
		
	}

}
