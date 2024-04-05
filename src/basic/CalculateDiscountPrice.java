package basic;

import java.util.Scanner;

public class CalculateDiscountPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the Total Purchase Amount");
	int amt = sc.nextInt();
	float discount;
	if(amt>=10000) {
		 discount = amt*0.10f;
	}
	else {
		 discount = amt*0.02f;
	}
	System.out.println("Discount: "+discount);
	}

}
