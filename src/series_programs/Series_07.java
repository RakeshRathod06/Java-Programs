package series_programs;

// 1/1! +2/2! +3/3!........n/n!
import java.util.Scanner;

public class Series_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n = sc.nextInt();
		float i, j;
		float sum = 0;
		float fact = 1;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				fact = fact *  j;

			}
			sum = sum + i / fact;
			System.out.print((int) i + "/" + (int)i + "!");
			if (i < n) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = " + sum);

	}

}
