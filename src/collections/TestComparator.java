package collections;

import java.util.*;

class AgeComparator implements Comparator<StudentComparable> {
	public int compare(StudentComparable s1, StudentComparable s2) {
		if (s1.age == s2.age) {
			return 0;
		} else if (s1.age > s2.age) {
			return 1;
		} else {
			return -1;
		}
	}

}

class NameComparator implements Comparator<StudentComparable> {
	public int compare(StudentComparable s1, StudentComparable s2) {
		return s1.name.compareTo(s2.name);

	}
}

public class TestComparator {
	void comparatorDemo() {
		List<StudentComparable> al = new ArrayList<StudentComparable>();
		al.add(new StudentComparable(1, "Teena", 42));
		al.add(new StudentComparable(2, "Leena", 23));
		al.add(new StudentComparable(3, "Reena", 24));
		System.out.println("Sorting By Age");
		Collections.sort(al, new NameComparator());
		for (StudentComparable st : al) {
			System.out.println(st.rollNo + " " + st.name + " " + st.age);
		}
		System.out.println("--------------------------------------------------------------------");

		System.out.println("Sorting By Name");
		Collections.sort(al, new AgeComparator());
		for (StudentComparable st : al) {
			System.out.println(st.rollNo + " " + st.name + " " + st.age);
		}
		System.out.println("----------------------------------------------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestComparator obj = new TestComparator();
		obj.comparatorDemo();
	}

}
