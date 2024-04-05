package series_programs;
//  1/1+2/2+3/3+4/4........n/n
import java.util.Scanner;

public class Series_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n= sc.nextInt();
		float i,sum;
		sum=0;
		for(i=1;i<=n;i++) {
			sum=sum+(i/i);
			System.out.print((int)i+"/"+(int)i);
			if(i<n) {
				System.out.print(" + ");
			}
		}
		System.out.print(" = "+sum);
	}

}
