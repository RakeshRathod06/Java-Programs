package ArrayPrograms;

import java.util.Scanner;

public class AscendingDescendingMix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of array: ");
//		int size = sc.nextInt();
		int a[] = new int[10];
		System.out.println("Enter the array Elements: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int temp;
		for (int i = 0; i < 5 - 1; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 5; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Resultant Arrray: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
