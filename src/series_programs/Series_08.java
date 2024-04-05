package series_programs;
// 1-2 +3-4 +5-6.........n-(n+1)
import java.util.Scanner;

public class Series_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value Of n: ");
		int n= sc.nextInt();
		int i,sum;
		sum=0;
		for(i=1;i<=n;i+=2) {
			sum=sum+(i-(i+1));
			System.out.print(i+" - "+(i+1));
			if(i<n) {
			System.out.print(" + ");
			}
		}
		System.out.print(" = "+sum);
	}

}
