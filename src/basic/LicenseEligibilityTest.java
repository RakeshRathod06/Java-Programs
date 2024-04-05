package basic;

import java.util.Scanner;

public class LicenseEligibilityTest {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter the age: ");
	int age = sc.nextInt();
	if(age>18) {
		System.out.println("You are Eligible");
	}
	else {
		System.out.println("You Are Not Eligible");
	}
}
}
