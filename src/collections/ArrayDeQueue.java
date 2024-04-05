package collections;

import java.util.*;
import java.util.Deque;

public class ArrayDeQueue {

	public static void main(String[] args) {
		Deque<String> q  =new ArrayDeque<>();
		q.add("Coffee");
		q.offer("Tea");
		q.offer("Ice-Cream");
		q.offer("Sandwitch");
		q.offer("Pizza");
		q.offer("Burger");
//		q.offer(null);  we cant store null value in the queue if we add then it will show runtime Exception
	
		System.out.println("Deque: "+q);
		System.out.println("Removing First Element: "+q.pollFirst());
		System.out.println("Deque"+q);
		System.out.println("Removing Last Element: "+q.pollLast());
		
		System.out.println("Deque"+q);		
		System.out.println("Head Of Queue: "+q.peek());
	}

}
