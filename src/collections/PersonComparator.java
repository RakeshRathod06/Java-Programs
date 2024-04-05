package collections;

import java.util.*;

class Person2 implements Comparator<Person2> {
	private int id;
	private String name;
	private int age;
//	

	public Person2(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int compare(Person2 p1, Person2 p2) {

		if (p1.id > p2.id) {
			return 1;
		} else if (p1.id < p2.id) {
			return -1;
		} else {
			return 0;
		}

	}
//	@Override
//	public String toString() {
//		return "Person2 [id=" + id + ", name=" + name + ", age=" + age + "]";
//	}

}

class PersonIdComparator implements Comparator<Person2> {

	public int compare(Person2 pid1, Person2 pid2) {
		return Integer.compare(pid1.getId(), pid2.getId());
	}

}

class PersonNameComparator implements Comparator<Person2> {
	public int compare(Person2 pname1, Person2 pname2) {
		return (pname1.getName().compareTo(pname2.getName()));

	}

}

public class PersonComparator {
	void ComparatorDemo() {
		List<Person2> al = new ArrayList<Person2>();
		al.add(new Person2(105, "Raj", 24));
		al.add(new Person2(108, "Rina", 22));
		al.add(new Person2(103, "Vaibhavi", 25));
		al.add(new Person2(101, "Mahesh", 23));
		al.add(new Person2(102, "Jully", 20));

		System.out.println("***********Before Sorting By ID**************");
		for (Person2 p : al) {
			System.out.println(p.getId() + " " + p.getName() + " " + p.getAge());
//			System.out.println(p);

		}
		Collections.sort(al, new PersonIdComparator());
		System.out.println("***********After Sorting By ID**************");
		for (Person2 p : al) {
			System.out.println(p.getId() + " " + p.getName() + " " + p.getAge());
//			System.out.println(p);
		}

		System.out.println("***********Before Sorting By Name**************");
		for (Person2 p : al) {
			System.out.println(p.getId() + " " + p.getName() + " " + p.getAge());
//			System.out.println(p);

		}
		Collections.sort(al, new PersonNameComparator());
		System.out.println("***********After Sorting Name ID**************");
		for (Person2 p : al) {
			System.out.println(p.getId() + " " + p.getName() + " " + p.getAge());
//			System.out.println(p);
		}
	}

	public static void main(String[] args) {
		PersonComparator obj = new PersonComparator();
		obj.ComparatorDemo();
	}
}
