package shoping_website;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException() {
		super("Customer wallet Balance is not sufficient");
	}
}
