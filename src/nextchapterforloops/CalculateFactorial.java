package nextchapterforloops;

import java.util.Scanner;

public class CalculateFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number  :");
		int number=sc.nextInt();
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+number+" is "+fact);
	}

}
