package ArrayPrograms;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size: ");
		int row = sc.nextInt();
		System.out.println("Enter column  Size: ");
		int column = sc.nextInt();
		int a[][] = new int[row][column];
		int b[][] = new int[row][column];
		System.out.println("Enter 1st Array Elements: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter 2nd Array Elements: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Resultant Matrix: ");
		int c[][] = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(a[i][j] + b[i][j] + " ");
			}
			System.out.println();
		}
	}

}
