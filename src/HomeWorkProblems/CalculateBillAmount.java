package HomeWorkProblems;

import java.util.Scanner;

public class CalculateBillAmount {
	String name, phoneNo;
	int noOfCalls = 0;
	float rate, bill,tax;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name,phoneNo And No of Calls: ");
		name = sc.next();
		phoneNo = sc.next();
		noOfCalls = sc.nextInt();

		// call to the calculate mathod

	}

	public void billing() {
		if (noOfCalls <= 100) {
			System.out.println("No Charges: ");
		} else if (noOfCalls > 100 && noOfCalls < 300) {
			rate =0.80f;
		}

		else if (noOfCalls > 300 && noOfCalls < 500) {
			rate = 1.25f;
		} else {
			rate =  2.5f;
		}
		bill = noOfCalls * rate;
		tax = bill * 0.12f;
		System.out.println("Total Bill: "+bill);
		System.out.println("Applying 12% Service tax:"+tax);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateBillAmount obj = new CalculateBillAmount();
		obj.accept();
		obj.billing();
		

	}

}
