package has_a_relationship;

public class Employee extends Person {
	float workingDays, salary, perDay;

	public Employee() {
		super();
		perDay = 1800;
		workingDays = 27;
	}

	Employee(int id, String name, MyDate dob, Address add, float perDay, float workingDays) {
		super(id, name, dob, add);
		this.perDay = perDay;
		this.workingDays = workingDays;
	}

	public void calculate() {
		salary = workingDays * perDay;
	}

	public void display() {
		super.display();
		System.out.println("Salary: " + salary);
	}
}
