package has_a_relationship;

public class StudentGrade extends Student {
	String grade;

	StudentGrade() {
		super();
	}

	StudentGrade(int id, String name, MyDate dob, Address add, int physics, int chem, int maths) {
		super(id, name, dob, add, physics, chem, maths);
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
		if (percentage >= 90) {
			grade = "A+";
		} else if (percentage >= 80) {
			grade = "A";
		} else if (percentage >= 70) {
			grade = "B+";
		} else if (percentage >= 60) {
			grade = "B";
		} else {
			grade = "Fail";
		}

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Grade: " + grade);
	}
}
