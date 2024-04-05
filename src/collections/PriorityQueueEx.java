package collections;
import java.util.*;
public class PriorityQueueEx {

	public static void main(String[] args) {
		Queue<String> q  =new PriorityQueue<>();
		q.add("Jasmin");
		q.offer("Lotus");
		q.offer("Rose");
		q.offer("Mogra");
		q.offer("Lily");
//		q.offer(null);  we cant store null value in the queue if we add then it will show runtime Exception
		
		System.out.println("Queue: "+q);
		
		System.out.println("Head Of Queue: "+q.element());
		
		System.out.println("Removing Element: "+q.remove());
		
		System.out.println("After Removing the queue: "+q);
		
		System.out.println("Polling Element: "+q.poll());
		
//		System.out.println("Polling Last Element: "+q.pollLast());
		
//		System.out.println("Dequeue: "+q.deque());
		
		System.out.println("Head of Queue: "+q.peek());
	}

}
