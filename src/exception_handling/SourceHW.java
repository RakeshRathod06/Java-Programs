package exception_handling;

import java.util.Scanner;

class Myexception extends Exception {

	public Myexception(String message) {
		super(message);
	}

}

public class SourceHW {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		try {
			if (age < 15) {
				throw new Myexception("Age Should not be 15 OR Less than 15");
			} else {
				System.out.println("Age is Valid");
			}
		} catch (Myexception e) {
			e.printStackTrace();
		}

	}

}
