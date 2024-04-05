package classesandobjects;

import java.util.Scanner;

public class EmployeeEx {
	int id, workingDays;
	String name;
	float salary, perDay;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		name = sc.nextLine();
		System.out.println("Enter Working Days: ");
		workingDays = sc.nextInt();
		System.out.println("Enter Perday: ");
		perDay = sc.nextFloat();

	}

	public void calculateSalary() {
		salary = workingDays * perDay;
		System.out.println("Name: " + name);
		System.out.println("Employee id: " + id);
		System.out.println("Working Days: " + workingDays);
		System.out.println("Perday Salary " + perDay);
		System.out.println("Salary: " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeEx e1 = new EmployeeEx();
		e1.accept();
		e1.calculateSalary();

	}

}
