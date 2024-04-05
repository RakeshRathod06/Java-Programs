package abstration_in_java;

public interface Drawable {
	float PI=3.14f;
	void print();
	static void square(int a) {
		System.out.println("Square"+(a*a));
		
	}
	default void cube(int x) {
		System.out.println("cube"+(x*x*x));
	}
	
	static void show() {
		System.out.println("Inside show: Drawable");
	}
	
}
