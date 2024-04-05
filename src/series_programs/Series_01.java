package series_programs;
//1/1+1/2+1/3+1/4..........1/n
import java.util.Scanner;

// In this series we want the output like 1/2+1/
public class Series_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		float i,sum=0;
		for(i=1;i<=n;i++) {
			sum=sum+(1/i);
			System.out.print("1/"+(int)i);
			if(i<n) {
				System.out.print("+");
			}
			
		}
		System.out.print(" = "+sum);
	}

}
