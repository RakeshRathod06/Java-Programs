package basic;

import java.util.Scanner;

public class CheackNumberPositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		if(number>0) {
			System.out.println(number+" is Positive");
		}
		else if(number <0) {
			System.out.println(number+" is negative");
		}
		else {
			System.out.println("Number is Zero");
		}
	}

}
