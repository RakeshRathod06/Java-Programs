package has_a_relationship;

public class Customer extends Person {
	String productName;
	int quantity, prise, billAmount;

	Customer() {
		super();
		productName = "Pencil Box";
		prise = 45;
		quantity = 4;
	}

	Customer(int id, String name, MyDate dob, Address add, String productName, int prise, int quantity) {
		super(id, name, dob, add);
		this.productName = productName;
		this.prise = prise;
		this.quantity = quantity;
	}

	public void calculateBillAmount() {
		billAmount = prise * quantity;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Product Name: " + productName);
		System.out.println("Prise: " + prise);
		System.out.println("Quantity: " + quantity);
		System.out.println("Bill Amount: " + billAmount);
	}

}
