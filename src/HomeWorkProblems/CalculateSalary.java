package HomeWorkProblems;

import java.util.Scanner;

public class CalculateSalary {
	String empName;
	int empCode;
	float basicSalary, allowance, grossSalary, tax, netSalary;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		empName = sc.nextLine();
		System.out.println("Enter Employee Code: ");
		empCode = sc.nextInt();
		System.out.println("Enter Basic Salary: ");
		basicSalary = sc.nextInt();
	}

	public void allow() {
		allowance = basicSalary * 0.55f;
	}

	public void gross() {
		grossSalary = basicSalary + allowance;
	}

	public void tax() {
		tax = grossSalary * 0.12f;
	}

	public void net() {
		netSalary = grossSalary - tax;
	}

	public void display() {
		System.out.println("Employee Code: " + empCode);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Basic Salary: " + basicSalary);
		System.out.println("Tax: " + tax);
		System.out.println("Net Salary: " + netSalary);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateSalary emp = new CalculateSalary();
		emp.accept();
		emp.allow();
		emp.gross();
		emp.tax();
		emp.net();
		emp.display();

	}

}
