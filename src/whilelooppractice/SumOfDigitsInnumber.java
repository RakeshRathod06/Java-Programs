package whilelooppractice;

import java.util.Scanner;

public class SumOfDigitsInnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  Number: ");
		int n = sc.nextInt();
		int sum=0;
		int rem=0;
		while(n>0) {
			rem=n%10;
			sum = sum+rem;
			n=n/10;
		}
		System.out.println("Sum of digits: "+sum);
	}

}
