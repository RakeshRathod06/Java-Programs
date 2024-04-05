package basic;

import java.util.Scanner;

public class CalculateDiscountUsingSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Which item You buy \n press 1 for 'computer Stationary' \n press 2 for 'fixed disks' \n press 3 for 'computers' ");
		int itemcode = sc.nextInt();
		float discount = 0;
		switch(itemcode) {
		case 1:
			System.out.println("Enter the Amount in $");
			int amt1=sc.nextInt();
			if(amt1>=500) {
				discount=amt1*0.12f;
			}
			else if(amt1>=300) {
				discount=amt1*0.08f;
			}
			else {
				discount=amt1*0.02f;
			}
			break;
		case 2:
			float amt2;
			System.out.println("Enter the Amount in $");
			amt2=sc.nextInt();
			if(amt2>=2000) {
				discount=amt2*0.1f;
			}
			else if(amt2 >1500 && amt2<2000){
				discount=amt2*0.05f;
			}
			else {
				System.out.println("Please Buy More to take the Discount !");
			}
			break;
		case 3:
			float amt3;
			System.out.println("Enter the Amount in $");
			amt3=sc.nextInt();
			if(amt3>=5000) {
				discount=amt3*0.1f;
			}
			else if(amt3 >=2500 && amt3<5000){
				discount=amt3*0.05f;
			}
			else {
				System.out.println("Please Buy More to take the Discount !");
			}
			break;

		}
		System.out.println("You Saved: "+discount);
	}

}
