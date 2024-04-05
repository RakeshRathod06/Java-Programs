package multithreading;

class Customer {
	private int balance = 10000;

	public synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName() + " is Going to withdraw " + amount);

		if (balance < amount) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		balance -= amount;
		System.out.println("Withdraw Completed. \nBalance " + balance);
	}

	public synchronized void deposit(int amount) {
		System.out.println(Thread.currentThread().getName() + " is Going to Deposit " + amount);
		balance += amount;
		System.out.println("Deposit Completed. \nBalance " + balance);
		notify();
	}
}

public class InterThreadCommunicationEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		// Customer c2 = new Customer();

		new Thread("Raj") {
			public void run() {
				c1.withdraw(15000);
			}
		}.start();

		new Thread("Rina") {
			public void run() {
				c1.deposit(30000);
			}                        
		}.start();
	}

}
