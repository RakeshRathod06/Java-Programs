package collections;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); // class which implements List Interface and it is called as non-generic
										// ArrayList
		ArrayList<String> al2 = new ArrayList<>(); // This is called as generic ArrayList
		// Methods of arrayList Class
		al.add(25);
		al.add("Raj");
		al.add(54.69);
		al.add(25); // we can store duplicate element to all the List implemented classes and
					// ArrayList Also
		al.add(null);
		al.add(null);// we can also store more than one null value
		al.add(true);

		System.out.println("List 1 Elements" + al); // we can pass the object to print the ArrayList

		al2.add("LIly");
		al2.add("Lotus");
		al2.add("Mogra");
		al2.add("Rose");
		al2.add(null);
		System.out.println("List 2 Elements: " + al2);

		System.out.println("Iterating List Using Iterator Interface");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Iterating List using for each loop : ");
		for (String str : al2) {
			System.out.println(str);
		}

		System.out.println("After sorting collection is: ");
		Collections.sort(al2);
		for (String str : al2) {
			System.out.println(str);
		}

	}
}
