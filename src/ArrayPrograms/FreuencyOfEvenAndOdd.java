package ArrayPrograms;

import java.util.Scanner;

public class FreuencyOfEvenAndOdd {

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
		int even = 0;
		int odd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Even: " + even + "\nOdd: " + odd);
	}

}
