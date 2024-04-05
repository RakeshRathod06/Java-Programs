package ArrayPrograms;

import java.util.Scanner;

public class AverageOfEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the array Elements: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		float evenAvg, oddAvg;
		int evenSum = 0;
		int oddSum = 0;
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evenCount++;
				evenSum = evenSum + a[i];
			} else {
				oddCount++;
				oddSum = oddSum + a[i];
			}
		}
		evenAvg = evenSum / evenCount;
		oddAvg = oddSum / oddCount;
		System.out.println("Average Of Even Numbers: " + evenAvg);
		System.out.println("Average Of Odd Numbers: " + oddAvg);

	}

}
