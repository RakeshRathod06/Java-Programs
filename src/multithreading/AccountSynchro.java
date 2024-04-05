package multithreading;

public class AccountSynchro implements Runnable{
	
	private Account acc = new Account();
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			makeWithdrawal(1000);
		}
	}
	
	public synchronized void makeWithdrawal(int amount) {
		if(acc.getBalance()>=amount) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw ");
			try {
				
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			acc.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+" Complete withdrawal ");
			
		}
		else {
			
			System.out.println("No Sufficient Balance To Withdraw");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountSynchro dngr = new AccountSynchro();
		Thread t1 = new Thread(dngr);
		Thread t2 = new Thread(dngr);
		t1.setName("Sakshi");
		t2.setName("Varsha");
		t1.start();
		t2.start();
	}


}
