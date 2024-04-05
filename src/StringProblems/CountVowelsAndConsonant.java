package StringProblems;

import java.util.Scanner;

public class CountVowelsAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.next();
		int vowelCount = 0;
		int consonantCount = 0;
		for (int i = 0; i < s.length(); i++) {
//			switch (s.charAt(i)) {
//			case 'a':
//			case 'e':
//			case 'i':
//			case 'o':
//			case 'u':
//			case 'A':
//			case 'E':
//			case 'I':
//			case 'O':
//			case 'U':
//				vowelCount++;
//			default:
//				consonantCount++;
//			}

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				vowelCount++;
			} else
				consonantCount++;
		}
		System.out.println("Vowels: " + vowelCount);
		System.out.println("Consonant: " + consonantCount);
	}

}
