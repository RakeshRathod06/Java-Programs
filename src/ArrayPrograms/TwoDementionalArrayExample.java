package ArrayPrograms;

import java.util.Scanner;

public class TwoDementionalArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner Sc = new Scanner(System.in);
		int a[][] = { { 1, 2 }, { 3, 4 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
