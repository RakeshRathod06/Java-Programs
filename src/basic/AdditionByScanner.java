package basic;

import java.util.Scanner;

public class AdditionByScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,add,sub,mul,div;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		add=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
		System.out.println("Addition:"+add);
		System.out.println("Subtraction:"+add);
		System.out.println("Multiplication:"+add);
		System.out.println("Division:"+add);
				

	}

}
