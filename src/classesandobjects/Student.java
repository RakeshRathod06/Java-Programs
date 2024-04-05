package classesandobjects;

import java.util.Scanner;

public class Student {
	int roll;
	String name;
	float java, cpp, python;
	Scanner sc = new Scanner(System.in);

	public void accept() {
//		sc.nextLine();
//		System.out.println("Enter Name: ");
//		name = sc.nextLine();
		System.out.println("Enter Roll Number: ");
		roll = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		name = sc.nextLine();
		System.out.println("Enter marks of all 3 subjects: ");
		java = sc.nextFloat();
		cpp = sc.nextFloat();
		python = sc.nextFloat();
	}

	public void calculateAndDisplay() {
		float total = java + cpp + python;
		float percentage = total / 3;
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + roll);
		System.out.println("Total: " + total);
		System.out.println("percentage: " + percentage);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.accept();
		student1.calculateAndDisplay();
//		System.out.println(roll);    This line shows an compile time error because we cannot access the value non-static variable in to the static method or block
	}

}
