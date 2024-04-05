package shoping_website;

public class Customer {
	int id;
	String name;
	double walletBalance;
	String address;
	
	public Customer(int id,String name,double walletBalance,String address) {
		this.id=id;
		this.name=name;
		this.walletBalance=walletBalance;
		this.address=address;
	}
}
