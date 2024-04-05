package classesandobjects;
// This Constructor is used to call the another constructor within a same class
// to switch from one constructor to another constructor this() constructor is used
// call to the another constructor is depending upon the parameters which passed in to the this() constructor
public class thisConstructorEX {
	int n;
	String str;
	public thisConstructorEX() {
		this(7);
	}
	
	public thisConstructorEX(int n) {
		this("Hello");
		this.n=n;
	}
	
	public thisConstructorEX(String str) {
		this.str=str;
	}
	public void display() {
		System.out.println(str+" "+n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisConstructorEX obj = new thisConstructorEX();
		obj.display();
	}

}
