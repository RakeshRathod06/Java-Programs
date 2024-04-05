package classesandobjects;

import java.util.Scanner;

public class DefaultMethodEx {
	Scanner sc = new Scanner(System.in);

	// Default method without return type
	int a, b;

	public void accept() {
		System.out.println("Enter two values: ");
		a = sc.nextInt();
		b = sc.nextInt();

	}

	public int add() {
		return a + b;
	}

	public int sub() {
		return a - b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodEx obj = new DefaultMethodEx();
		obj.accept();
		int sum = obj.add();
		int sub = obj.sub();
		System.out.println("Addition: " + sum);
		System.out.println("Subtraction: " + sub);
	}

}
