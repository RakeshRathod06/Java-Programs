package abstration_in_java;

public abstract class HWBank {
	public abstract int getBalance();

	public static void main(String[] args) {
		BankA b1 = new BankA();
		System.out.println("BankA Balance: " + b1.getBalance());
		BankB b2 = new BankB();
		System.out.println("BankB Balance: " + b2.getBalance());
		BankC b3 = new BankC();
		System.out.println("BankC Balance: " + b3.getBalance());
	}

}

class BankA extends HWBank {
	public int getBalance() {
		return 100;
	}
}

class BankB extends HWBank {
	public int getBalance() {
		return 150;
	}
}

class BankC extends HWBank {
	public int getBalance() {
		return 200;
	}
}
