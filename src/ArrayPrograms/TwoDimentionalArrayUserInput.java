package ArrayPrograms;

import java.util.Scanner;

public class TwoDimentionalArrayUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size: ");
		int row = sc.nextInt();
		System.out.println("Enter column  Size: ");
		int column = sc.nextInt();
		int a[][] = new int[row][column];
		System.out.println("Enter Array Elements: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array Elements: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column;j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
