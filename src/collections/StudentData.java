package collections;

import java.util.*;

class Student {
	int rollNo;
	String name;
	int age;

	public Student(int rollNO, String name, int age) {
		this.rollNo = rollNO;
		this.name = name;
		this.age = age;
	}

//	public String toString() {
//		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
//	}

	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollNo);
		System.out.println("Age: "+age);
	}

}

public class StudentData {

	public static void main(String[] args) {

		List<Student> l = new ArrayList<>();

		Student s1 = new Student(21, "Raj", 23);
		Student s2 = new Student(22, "Sopan", 19);
		Student s3 = new Student(23, "Rohan", 20);
		Student s4 = new Student(24, "Vaibhav", 26);
		Student s5 = new Student(25, "Rahul", 18);

		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
//
//	for(Student studentInfo:l) {
//		System.out.println(studentInfo);
//	}

		Iterator<Student> itr = l.iterator();
//		while (itr.hasNext()) {
//			Student s = itr.next();
//			System.out.println(
//					" Student name: " + s.name + "\n Student Roll No: " + s.rollNo + "\n Student age: " + s.age);
//		}
		
		while (itr.hasNext()) {
			Student s = itr.next();
			s.display();
//			System.out.println(
//					" Student name: " + s.name + "\n Student Roll No: " + s.rollNo + "\n Student age: " + s.age);
		}
	}
}
