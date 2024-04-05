package has_a_relationship;

public class Student extends Person{
	int physics,chem,maths,total;
	float percentage;
	public Student() {
		super();
		physics=69;
		chem=75;
		maths=85;
	}
	public Student(int id,String name,MyDate dob,Address add,int physics,int chem,int maths) {
		super(id,name,dob,add);
		this.physics=physics;
		this.chem=chem;
		this.maths=maths;
	}
	public void calculate() {
		total=physics+chem+maths;
		percentage=total/3;
	}
	public void display() {
		super.display();
		System.out.println("Total: "+total);
		System.out.println("Percentage: "+percentage);
	}
	
}
