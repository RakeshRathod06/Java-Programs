package classesandobjects;

import java.util.Scanner;

public class ParameterizedMethodEx {

	// parameterized with return type
	public int mul(int a, int b) {
		return a * b;
	}

	// parameterized without return type
	public void div(int a, int b) {
		System.out.println("Division: " + (a / b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedMethodEx obj = new ParameterizedMethodEx();
		System.out.println("Enter the two values for multiplication and Division: ");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int mul= obj.mul(a, b);
		System.out.println("Multiplication: "+mul);
		obj.div(a, b);
		
	}

}
