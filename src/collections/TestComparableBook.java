package collections;

import java.util.*;

public class TestComparableBook {
	void comparableBook1() {
		List<Book1> b1 = new ArrayList<Book1>();
		b1.add(new Book1(7, "Book1", "Author4", "publisher4", 12));
		b1.add(new Book1(1, "Book2", "Author5", "publisher5", 15));
		b1.add(new Book1(2, "Book3", "Author6", "publisher6", 18));
		b1.add(new Book1(5, "Book4", "Author7", "publisher7", 21));

		System.out.println("***********Before Sorting*************");
		for (Book1 bk : b1) {
			System.out.println(bk.id + " " + bk.name + " " + bk.author + " " + bk.publisher);
		}
		Collections.sort(b1);
		System.out.println("*************After Sorting*************");
		for (Book1 bk : b1) {
			System.out.println(bk.id + " " + bk.name + " " + bk.author + " " + bk.publisher);
		}
	}

	public static void main(String[] args) {
		TestComparableBook obj = new TestComparableBook();
		obj.comparableBook1();
	}
}

class Book1 implements Comparable<Book1> {
	int id;
	String name, author, publisher;
	int quantity;

	public Book1(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	public int compareTo(Book1 b) {
		if (id > b.id) {
			return 1;
		} else if (id < b.id) {
			return -1;
		} else {
			return 0;
		}
	}

}
