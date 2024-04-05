package ArrayPrograms;

import java.util.Scanner;

public class SumOfEvenAndProductOfOdd {

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
		int sum = 0;
		int product = 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum = sum + a[i];
			} else {
				product = product * a[i];
			}
		}
		System.out.println("Sum: " + sum + "\nProduct: " + product);

	}

}
