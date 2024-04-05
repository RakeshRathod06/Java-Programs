package ArrayPrograms;

import java.util.Scanner;

public class RollNumberProblemArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of array: ");
//		int size = sc.nextInt();
		int rollNo[] = new int[5];
		int marks[] = new int[5];
		System.out.println("Enter the Roll Numbers Of Students: ");
		for (int i = 0; i < rollNo.length; i++) {
			rollNo[i] = sc.nextInt();
		}
		System.out.println("Enter the Marks Of Students: ");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}

		int t1, t2;
		for (int i = 4; i >= 0; i--) {
			for (int j = i + 1; j < marks.length; j++) {
				if (marks[i] < marks[j]) {
					t1 = marks[i];
					marks[i] = marks[j];
					marks[j] = t1;

					t2 = rollNo[i];
					rollNo[i] = rollNo[j];
					rollNo[j] = t2;

				}

			}
//			System.out.print(marks[i]+" ");
		}
		System.out.print("Marks In Descending Order: ");
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] + " ");

		}

	}

}
