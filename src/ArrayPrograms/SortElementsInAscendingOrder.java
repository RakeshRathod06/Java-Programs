package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortElementsInAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sort Array By Using Function
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the array Elements: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.print("Array in Scending Order: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
