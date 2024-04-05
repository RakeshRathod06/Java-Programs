package collections;
import java.util.*;
public class StackEx {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("Gauva");
		s.push("Mango");
		s.push("Banana");
		s.push("Gauva");
		s.push("Pich");
		s.push("null");
		
		System.out.println("Stack: "+s);
		System.out.println("Removing Element: "+s.pop());
		System.out.println("Stack After Removing top of the stack: "+s);
		System.out.println("Search Mango: "+s.search("Mango"));//4
		System.out.println("Search Watermelon: "+s.search("Watermelon"));//returns -1 means watermelon is not present in the stack 
		System.out.println("Peek Operation: "+s.peek()); // to view which element at the top of the stack
	}

}
