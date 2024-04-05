package ArrayPrograms;

import java.util.Scanner;

public class FrequescyOfPositiveNegativeAndZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int p = 0, n = 0, z = 0;
		int a[] = new int[size];
		System.out.println("Enter the array Elements: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0)
				p++;
			else if (a[i] < 0)
				n++;
			else
				z++;
		}
		System.out.println(" Positive: " + p + "\n Negative: " + n + " \n Zero: " + z);

	}

}
