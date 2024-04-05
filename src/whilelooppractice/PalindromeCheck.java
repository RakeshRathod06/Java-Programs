package whilelooppractice;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  Number: ");
		int n = sc.nextInt();
		int original = n;
		int rev=0,rem=0;
		while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(original == rev) {
			System.out.println("pelindrome");
		}
		else {
			System.out.println("Not pelindrome");
		}
	}

}
