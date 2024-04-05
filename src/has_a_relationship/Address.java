package has_a_relationship;

public class Address {
	String addLine;
	String street;
	String city;
	String state;
	int pinCode;

	Address() {
		addLine = "Newale Vasti";
		street = "Chikhali-Akurdi Road";
		city = "Pune";
		state = "Maharashtra";
		pinCode = 411062;
	}
	Address(String addLine,String street,String city,String state,int pinCode){
		this.addLine=addLine;
		this.street =street;
		this.city=city;
		this.state=state;
		this.pinCode=pinCode;
	}
	public void display() {
		System.out.println(addLine+" "+street+" "+city+" "+state+" "+pinCode);
	}
}
