package collections;
import java.util.*;
import java.util.Map.Entry;
class HMExample{
	void hmDemo() {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Mango");
		hm.put(2,"grapse");
		hm.put(3, "Banana");
		hm.put(4,"Apple");
		
		System.out.println("Iterating HashMap");
		System.out.println(" Keys "+" "+" Values ");
		for(Entry<Integer, String> m: hm.entrySet()) {
			System.out.println(" "+m.getKey()+"      "+m.getValue()+" ");
		}
//		Iterator itr = hm.iterator();
	}
}
public class HashMapDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HMExample obj = new HMExample();
		obj.hmDemo();
	}

}
