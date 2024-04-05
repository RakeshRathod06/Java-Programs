package StringProblems;

import java.util.Scanner;
// program to find Number Of words in the string
public class CountNoOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		String word[] = s.split(" ");
		int count = 0;
		for (int i = 0; i < word.length; i++) {
			count++;

		}
		System.out.println("No Of Words: " + count);
	}

}
