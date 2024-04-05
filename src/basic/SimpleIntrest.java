package basic;

import java.util.Scanner;

//program to find the Simple Interest
public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The principle Amount:");
		int p= sc.nextInt();
		System.out.println("Enter the time: ");
		int n=sc.nextInt();
		System.out.println("Enter the Rate of intrest: ");
		int r=sc.nextInt();
		
		int simpleIntrest = (p*n*r)/100;
		
		System.out.println("Simple Interest is: "+simpleIntrest);

	}

}
