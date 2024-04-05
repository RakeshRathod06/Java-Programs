package basic;

import java.util.Scanner;

public class CheackWovelOrConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character: ");
		char ch = sc.next().charAt(0);
		switch(ch) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("wovel");
			break;
		default:
			System.out.println("consonant");

			
		}			
		
			
//		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
//			System.out.println(ch+" is Wovel");
//		}
//		else {
//			System.out.println(ch+" is Consonant");
//		}
	}
}
