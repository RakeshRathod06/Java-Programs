package HomeWorkProblems;

import java.util.Scanner;

public class SimpleInterestUsingConstructor {
	int p, r, t;

	public SimpleInterestUsingConstructor() {
		p = 25000;
		r = 8;
		t = 3;
	}

	public SimpleInterestUsingConstructor(int p, int r, int t) {
		// TODO Auto-generated constructor stub
		this.p = p;
		this.r = r;
		this.t = t;
	}

	public float calulate() {
		float si = (p * r * t / 100);
		return si;
//		System.out.println("Simple Interest Using Default Constructor: " + si);
//		System.out.println("Simple Interest Using Parameterized Constructor: " + si);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleInterestUsingConstructor obj = new SimpleInterestUsingConstructor();
		System.out.println("Simple Interest Using Default Constructor: " + obj.calulate());

		System.out.println("Enter Principle Amount\nEnter rate of interest\nAnd Enter Time in years");
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		SimpleInterestUsingConstructor obj1 = new SimpleInterestUsingConstructor(p, r, t);
		System.out.println("Simple Interest Using Parameterized Constructor: " + obj.calulate());

	}

}
