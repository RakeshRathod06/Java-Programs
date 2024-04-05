package collections;

import java.util.*;
import java.util.Map.Entry;

public class HashMapCRUD {
	void crud() {
		HashMap<Integer,Book> hm = new HashMap<Integer,Book>();
		
		// create Books
		Book b1 = new Book(101, "Physics", "Prateek");
		Book b2 = new Book(102, "Chemistry", "Dhaval");
		Book b3 = new Book(103, "Maths", "Kaif");
		
		// Add Books
		hm.put(b1.getId(), b1);
		hm.put(b2.getId(), b2);
		hm.put(b3.getId(), b3);
		for(Entry<Integer, Book> m: hm.entrySet()) {
			System.out.println(m);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapCRUD obj = new HashMapCRUD();
		obj.crud();
		
	}
}

class Book {
	private int id;
	private String title;
	private String author;

	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
}
