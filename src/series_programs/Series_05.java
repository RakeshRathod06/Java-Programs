package series_programs;

import java.util.Scanner;

// 1,2,3,4..........n
public class Series_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n= sc.nextInt();
		int i,sum;
		sum=0;
		for(i=1;i<=n;i+=2) {
			sum=sum+i;
			System.out.println(i+" ");
		}
		System.out.println("Sum of Odd numbers till "+n+" is: "+sum);
	}

}
