package HomeWorkProblems;

import java.util.Scanner;

public class CheckPrimeNumber {
	public void checkPrime(int n) {
		int flag = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println(n + " is not prime Number");
				break;
			} else {
				flag = 1;
			}
		}
		if (flag == 1) {
			System.out.println(n+" is prime Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		CheckPrimeNumber obj = new CheckPrimeNumber();
		obj.checkPrime(num);
	}

}
