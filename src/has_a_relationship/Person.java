package has_a_relationship;

public class Person {
	int id;
	String name;
	MyDate dob;
	Address add;
	Person(){
		id=101;
		name="Rakesh";
		dob=new MyDate();
		add=new Address();
		
	}
	Person(int id,String name,MyDate dob,Address add){
		this.id=id;
		this.name=name;
		this.dob=dob;
		this.add=add;
	}
	public void display() {
		System.out.println("Persion id: "+id);
		System.out.println("Persion name: "+name);
		dob.display();
		add.display();
	}
}
