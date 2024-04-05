package java_8_features;

import java.util.ArrayList;
import java.util.List;


@FunctionalInterface
interface SortByName {
	public void sortByName(EmployeeEx e1,EmployeeEx e2);
}

public class EmployeeEx {
	int id, age;
	String name;

	public EmployeeEx(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}



	public String getName() {
		return name;
	}
	



	
	@Override
	public String toString() {
		return "EmployeeEx [id=" + id + ", age=" + age + ", name=" + name + "]";
	}



	public static void main(String[] args) {
		List<EmployeeEx> al = new ArrayList<EmployeeEx>();

		al.add(new EmployeeEx(101, 23, "Rajiv"));
		al.add(new EmployeeEx(105, 20, "Hitesh"));
		al.add(new EmployeeEx(110, 19, "Raghav"));
		al.add(new EmployeeEx(102, 24, "Amit"));

        // Sorting the list by name using a lambda expression
        al.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));

        // Using forEach method to print the sorted list
        al.forEach(System.out::println);

	}

}
