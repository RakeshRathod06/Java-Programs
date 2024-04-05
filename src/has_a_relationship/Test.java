package has_a_relationship;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person per = new Person();
//		per.display();
//		Person per2 = new Person(105, "Riya", new MyDate(11, 03, 2002),
//				new Address("Ravet", "old - Road", "Mumbai", "Rajasthan", 423205));
//		per2.display();

//		Employee emp = new Employee();
//		emp.calculate();
//		emp.display();

//		Employee emp2 = new Employee(110, "Rakhi", new MyDate(16, 9, 2004),
//				new Address("More Vasti", "Nashik Highway", "Dhule", "Maharashtra", 423205), 1950, 29);
//		emp2.calculate();
//		emp2.display();

//		Student s1 = new Student();
//		s1.calculate();
//		s1.display();

//		SalesPerson sale= new SalesPerson();
//		sale.calculate();
//		sale.display();
//		
//		SalesPerson sale1  = new SalesPerson(108, "Rakhi", new MyDate(1,5,2001),new Address("Panchavati Nest","Akurdi Road","Pune","Maharashtra",411062), 1520, 27, 96);
//		sale1.calculate();
//		sale1.display();

//		StudentGrade student1 = new StudentGrade();
//		student1.calculate();
//		student1.display();
//
//		StudentGrade student2 = new StudentGrade(111, "Nivrutti", new MyDate(5, 9, 1203),
//				new Address("Aalandi", "Old highway", "Pune", "Maharashtra", 411005), 85, 90, 95);
//		student2.calculate();
//		student2.display();

		Discount c1 = new Discount();
		c1.calculateBillAmount();
		c1.display();

		Discount c2 = new Discount(115, "Monal", new MyDate(13, 7, 1981),
				new Address("Kharadi", "Mumbai-Pune highway", "Pune", "Maharashtra", 411036), "Sundaram Notebook", 105,
				210);
		c2.calculateBillAmount();
		c2.display();

	}

}
