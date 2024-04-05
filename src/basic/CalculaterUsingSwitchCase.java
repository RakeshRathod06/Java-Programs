package basic;

import java.util.Scanner;

public class CalculaterUsingSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two numbers for operation");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Enter Your Choice: ");
		System.out.println(" + for addition \n - for subtraction \n * for multiplication \n / for Division");
		char operation = sc.next().charAt(0);
		switch(operation) {
		case '+':
			System.out.println("Addition: "+(num1+num2));
			break;
		case '-':
			System.out.println("Subtraction: "+(num1-num2));
			break;
		case '*':
			System.out.println("Multiplication: "+(num1*num2));
			break;
		case '/':
			System.out.println("Division: "+(num1/num2));
			break;
		default:
			System.out.println("Invalid Choice !");
		}
	
		
	}

}
