package series_programs;

import java.util.Scanner;

// 1,8,27,64........n
public class Series_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of n: ");
		int n = sc.nextInt();
		int i;
		for(i=1;i<=n;i++) {
			System.out.print((i*i*i)+" ");
		}
	}

}
