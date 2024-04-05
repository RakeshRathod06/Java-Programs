package basic;

import java.util.Scanner;

public class CalculateTaxAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary: ");
		float salary = sc.nextInt();
		//12% means 12/100 which is equals to 1.12
		float taxAmt = salary * 0.12f;
		System.out.println("New Amount: "+taxAmt);
	}

}
