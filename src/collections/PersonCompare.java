package collections;

import java.util.*;

class Person implements Comparable<Person> {
	private int id;
	private String name;
	private int age;

//	public Person(int id, String name, int age) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person p) {

		if (id > p.id) {
			return 1;
		} else if (id < p.id) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class PersonCompare {

	void ComparablePerson() {
		List<Person> al = new ArrayList<>();
		Person p1 = new Person();
		p1.setId(110);
		p1.setName("Rajan");
		p1.setAge(25);

		Person p2 = new Person();
		p2.setId(105);
		p2.setName("Riya");
		p2.setAge(22);

		Person p3 = new Person();
		p3.setId(101);
		p3.setName("Sonam");
		p3.setAge(23);

		al.add(p1);
		al.add(p2);
		al.add(p3);

		System.out.println("***********Before Sorting*************");
		for (Person p : al) {
			System.out.println(p.getId() + " " + p.getName() + " " + p.getAge());
		}
		Collections.sort(al);
		System.out.println("*************After Sorting*************");
		for (Person p : al) {
			System.out.println(p.getId() + " " + p.getName() + " " + p.getAge());
		}
	}

	public static void main(String[] args) {
		PersonCompare obj = new PersonCompare();
		obj.ComparablePerson();
	}
}
