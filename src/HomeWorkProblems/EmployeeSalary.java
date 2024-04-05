package HomeWorkProblems;

import java.util.Scanner;

public class EmployeeSalary {
	String name;
	int id, perDay, workingDays, salary;

	public EmployeeSalary(String name, int id, int workingDays, int perDay) {
		this.id = id;
		this.name = name;
		this.workingDays = workingDays;
		this.perDay = perDay;
	}

	public EmployeeSalary() {
		// TODO Auto-generated constructor stub
		id = 101;
		name = "Raj";
		workingDays = 26;
		perDay = 950;
	}

	public int calculate() {
		salary = perDay * workingDays;
		return salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		String name = sc.next();
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("Enter Working Days: ");
		int workingDays = sc.nextInt();
		System.out.println("Enter perDay: ");
		int perDay = sc.nextInt();
		EmployeeSalary emp = new EmployeeSalary();
		System.out.println("Salary Using Default Constructor: " + emp.calculate());
		EmployeeSalary emp1 = new EmployeeSalary(name, id, workingDays, perDay);
		System.out.println("Salary Using Parameterized Constructor: " + emp1.calculate());
	}

}
