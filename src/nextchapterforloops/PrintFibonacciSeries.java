package nextchapterforloops;

import java.util.Scanner;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Last Number: ");
		int n = sc.nextInt();
		int num1=0;
		int num2=1;
		System.out.print(num1+" "+num2+" ");
		int num3;
		for(int i =2;i<=n;i++) {
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(num3+" ");
		}
	}

}
