package abstration_in_java;

public abstract class Parent {
	public abstract void message();
	public static void main(String[] args) {
		method1 obj1 = new method1();
		obj1.message();
		method2 obj2 = new method2();
		obj2.message();
	}
}
class method1 extends Parent{
	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is first subclass");
	}
	
}
class method2 extends Parent{
	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is second subclass");
	}
}
