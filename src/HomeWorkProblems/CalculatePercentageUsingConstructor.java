package HomeWorkProblems;

import java.util.Scanner;

public class CalculatePercentageUsingConstructor {
	int id, s1, s2, s3;
	String name;
	float percentage;

	public CalculatePercentageUsingConstructor() {
		// TODO Auto-generated constructor stub
		name = "Raj";
		id = 101;
		s1 = 75;
		s2 = 85;
		s3 = 95;

	}

	public CalculatePercentageUsingConstructor(int id, String name, int s1, int s2, int s3) {
		this.id = id;
		this.name = name;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public float calculate() {
		int total = s1 + s2 + s3;
		percentage = total / 3;
		return percentage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stuent Name: ");
		String name = sc.next();
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("Enter 3 Subject Marks: ");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		CalculatePercentageUsingConstructor obj = new CalculatePercentageUsingConstructor();
		System.out.println("Percentage Using Default Constructor: " + obj.calculate());
		CalculatePercentageUsingConstructor obj1 = new CalculatePercentageUsingConstructor(id, name, s1, s2, s3);
		System.out.println("Percentage Using Parameterized Constructor: " + obj1.calculate());
	}

}
