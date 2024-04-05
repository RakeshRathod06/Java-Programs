package StringProblems;

import java.util.Scanner;

public class RemoveGivenCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.next();
		System.out.println("Which Character You want to remove: ");
		char ch = sc.next().charAt(0);
		String newStr = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ch) {
				newStr = newStr + s.charAt(i);
			}
		}
		System.out.println("New String: "+newStr);
	}

}
