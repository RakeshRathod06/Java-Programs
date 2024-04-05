package series_programs;
// 1/1+2/4+3/9+4/16.........n/n^2
import java.util.Scanner;

public class Series_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt()	;
		float i,sum;
		sum=0;
		for(i=1;i<=n;i++) {
			sum=sum+(1/(i*i));
			System.out.print((int)i+"/"+((int)i)*(int)i);
			if(i<n) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = "+sum);
		
	}

}
