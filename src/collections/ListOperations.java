package collections;

import java.util.*;

public class ListOperations {
	List<String> l = new ArrayList<String>();

	public void create() {

		// Insert Operation
		System.out.println("List Created....!");
		l.add("Vaibhav");
		l.add("Raghav");
		l.add("Nandini");
		l.add("Rakhi");
		l.add(null);
		l.add("Nandini");
		l.add("Piyush");
		l.add("Nivrutti");
		l.add("Nivrutti");
		l.add("Nandini");

		System.out.println("After Adding Element List Is: ");
		for (String name : l) {
			System.out.println(name);
		}
	}

	public void update() {
		int indexAt = 1;
		l.set(indexAt, "Nitin");

		System.out.println("Updated List: ");
		for (String name : l) {
			System.out.println(name);
		}
	}

	public void remove() {
		l.remove("Nandini");
		l.remove(2);

		System.out.println("After Removing specific element list is: ");
		for (String name : l) {
			System.out.println(name);
		}
	}
	public void removeAllDuplicate() {
		Set<String> s = new HashSet<String>(l);
		System.out.println("After Removing all Duplicates from the list. The list is :");
		for(String name:s) {
			System.out.println(name);
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListOperations obj = new ListOperations();
		obj.create();
		obj.update();
		obj.remove();
		obj.removeAllDuplicate();


	}

}
