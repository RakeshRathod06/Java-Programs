package has_a_relationship;

public class Discount extends Customer {
	float discount;

	public Discount() {
		super();
	}

	public Discount(int id, String name, MyDate dob, Address add, String productName, int prise, int quantity) {
		super(id, name, dob, add, productName, prise, quantity);
	}

	@Override
	public void calculateBillAmount() {
		// TODO Auto-generated method stub
		super.calculateBillAmount();
		if (billAmount > 20000) {
			discount = billAmount * 0.15f;
		} else if (billAmount > 15000) {
			discount = billAmount * 0.1f;
		} else if (discount > 10000) {
			discount = billAmount * 0.07f;
		} else {
			discount = billAmount * 0;
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.printf("Discount: %.2f",discount);
	}
}
