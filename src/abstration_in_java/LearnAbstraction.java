package abstration_in_java;

abstract class DemoAbstraction {
	public DemoAbstraction() // constructor of abstract class
	{
		System.out.println("This is constructor of abstract class");
	}

	public abstract void a_method(); // abstract method of abstract class

	public void normalMethod() // normal method of abstract class
	{
		System.out.println("This is normal method of abstract class");
	}
}

class SubClass extends DemoAbstraction {
	public void a_method() {
		System.out.println("This is abstract method");
	}
}

public class LearnAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sc = new SubClass();
		sc.a_method();
		sc.normalMethod();

	}

}
