package HomeWorkProblems;

import java.util.Scanner;

public class ArithmeticOperation {
	public int add(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	public int mod(int a,int b) {
		return a%b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for the Arithmetic operation: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		ArithmeticOperation obj = new ArithmeticOperation
				();
		int add = obj.add(num1,num2);
		int sub = obj.sub(num1,num2);
		int mul = obj.mul(num1,num2);
		int div = obj.div(num1,num2);
		int rem = obj.mod(num1,num2);
		
		System.out.println("Addition: "+add);
		System.out.println("subtraction: "+sub);
		System.out.println("Multiplication: "+mul);
		System.out.println("Division: "+div);
		System.out.println("Remainder: "+rem);
		

	}

}
