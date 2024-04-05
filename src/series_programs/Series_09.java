package series_programs;
// 1 4 9 16 25........n^2
import java.util.Scanner;

public class Series_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of n: ");
		int n = sc.nextInt();
		int i;
		for(i=1;i<=n;i++) {
			System.out.print((i*i)+" ");
		}
	}

}
