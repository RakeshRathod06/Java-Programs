package nextchapterforloops;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println(" Enter two numbers: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println(" Addition: " + (num1 + num2));

			System.out.println(" Do You Want To Continue ! \n Press Y for Continue ");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}

}
