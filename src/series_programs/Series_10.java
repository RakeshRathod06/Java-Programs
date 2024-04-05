package series_programs;

import java.util.Scanner;

// 1,9,25,49,81.........n
public class Series_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i+=2) {
			System.out.print(i*i+" ");
		}
	}

}
