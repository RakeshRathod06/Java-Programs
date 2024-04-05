package StringProblems;

import java.util.Scanner;

import HomeWorkProblems.CheckPrimeNumber;

public class Pallindrome {
	public boolean checkPallindrome(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.next();

		Pallindrome obj = new Pallindrome();
		boolean isString = obj.checkPallindrome(s);

		if (isString==true) {
			System.out.println("Pallindrome");
		} else
			System.out.println("Not Pallindrome");
	}

}
