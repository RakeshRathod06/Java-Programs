	
package HomeWorkProblems;

import java.util.Scanner;

public class SecondSmallestElementInArray {
	public int seconSmallestElement(int a[]) {
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("\nSorted Array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		return a[1];
	}

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
		System.out.println("Original Array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		SecondSmallestElementInArray obj = new SecondSmallestElementInArray();
		System.out.println("\nSecond Smallest Element: " + obj.seconSmallestElement(a));

	}

}
