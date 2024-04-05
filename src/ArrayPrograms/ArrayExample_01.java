package ArrayPrograms;

import java.util.Scanner;

public class ArrayExample_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Enter Array Size: ");
		int size = sc.nextInt();
		int b[] = new int[size];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		System.out.println("Array Elements Are: ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		int bLength = b.length;
		int middle = bLength / 2;
		System.out.println("Middle Element In The Array is: " + middle);
	}

}
