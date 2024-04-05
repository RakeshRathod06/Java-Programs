package series_programs;
// 1*2+2*3+3*4+4*5...........n*(n+1)
import java.util.Scanner;

public class Series_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of n: ");
		int n= sc.nextInt();
		int i,sum;
		sum=0;
		for(i=1;i<=n;i++) {
			sum=sum+(i*(i+1));
			System.out.print(i+"*"+(i+1));
			if(i<n) {
				System.out.print(" + ");
			}
		}
		System.out.print(" = "+sum);
	}

}
