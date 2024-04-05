package basic;

import java.util.Scanner;

public class PhoneBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of calls");
		int noOfCalls= sc.nextInt();
		int billAmount;
		if(noOfCalls < 200) {
			billAmount =noOfCalls*1;
		}
		else {
			billAmount=noOfCalls*3;
		}
		System.out.println("Bill Amount:"+billAmount);
		
	}

}
