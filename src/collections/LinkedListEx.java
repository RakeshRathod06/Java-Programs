package collections;
import java.util.*;
public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Mango");
		ll.add("Papita");
		ll.add("Grapes");
		ll.add("Apple");
		ll.add("Banana");
		ll.add("Pich");
		ll.add(null);
		
		for(String str: ll) {
			System.out.println(str);
		}
		
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Jasmine");
		ll2.add("Lily");
		
		ll2.addAll(ll);
		System.out.println("adding list 1 then list 2 becomes: "+ll2);
	}
	
	

}
