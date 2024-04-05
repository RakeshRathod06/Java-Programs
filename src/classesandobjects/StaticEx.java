package classesandobjects;

public class StaticEx {
	int rollNo;
	String name;
	static String instituteName = "Edubridge"; // static variable stores in class area
	// static variables can accessible throught the program

	 public StaticEx(){
		 rollNo=105;
		System.out.println("I am in Default Constructor");
	}
	public StaticEx(int rno, String nm) {
		rollNo = rno;
		name = nm;
	}
	public void display() {
		System.out.println("Roll Number: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Institute Name: " + instituteName);
	}
	public static void changeName(String changeName)
	{ 
		// static method for changing the value of static variable
		instituteName = changeName;
	}
	static {
		// This is static block
		System.out.println("static block is called Before main() method");
	}
	
	{
		// This is Instance Block
		System.out.println("Instance block will called if we created the instance otherwise no !");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		changeName("Edubridge India Pvt Ltd");
		StaticEx std = new StaticEx();// Default Constructor
		StaticEx std1 = new StaticEx(101, "Rahul"); // Parameterized Constructor
		StaticEx std2 = new StaticEx(102, "Suraj"); // Parameterized constructor
		std1.display();
		std2.display();
		System.out.println(instituteName);

	}

}
