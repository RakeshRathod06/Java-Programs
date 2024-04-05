package ArrayPrograms;

import java.util.Scanner;

public class PrintOnlyEvenElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("Enter the array Elements: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Even elements In An Array: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}
	}

}
