package StringProblems;

import java.util.Scanner;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.next();
		System.out.println("Which Character You want to count frequency: ");
		char ch = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		

		}
		System.out.println(ch+" repeat "+ count+" times");
	}

}
