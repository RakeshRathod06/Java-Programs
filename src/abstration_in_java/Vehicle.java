package abstration_in_java;

public abstract class Vehicle {
	public Vehicle(){
		System.out.println("Constructor in absract class Vehicle");
	}
	public void run() {
		System.out.println("Running Safely");
	}
	public abstract void changeGear(); // this is abstract method() which need to implement in the child class
	
}
