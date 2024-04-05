package basic;

import java.util.Scanner;

public class EvenOddCheack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int number = sc.nextInt();
		if(number%2==0) {
			System.out.println(number+" is Even");
		}
		else {
			System.out.println(number+" is odd");
		}
	}
}
