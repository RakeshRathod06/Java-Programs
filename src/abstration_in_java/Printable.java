package abstration_in_java;

public interface Printable {
	void display();
	
	static void show() {
		System.out.println("Inside show: Printable");
	}
}
