package basic;

import java.util.Scanner;

public class PrintTaxAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Salary Amount");
		float salary = sc.nextInt();
		float TaxAmt;
		if(salary<25000) {
			TaxAmt = salary*0.1f;
		}
		else {
			TaxAmt=salary*0.15f;
		}
		System.out.println("Tax Amount: "+TaxAmt);
	}

}
