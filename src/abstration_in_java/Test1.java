package abstration_in_java;

abstract class Parent1 {
	public abstract void message();
}

class child1 extends Parent1 {
	public void message() {
		System.out.println("This is first subclass");
	}
}

class child2 extends Parent1 {
	public void message() {
		System.out.println("This is second subclass");
	}
}

public class Test1 {
	public static void main(String[] args) {
		child1 c1 = new child1();
		c1.message();
		child2 c2 = new child2();
		c2.message();
	}
}
