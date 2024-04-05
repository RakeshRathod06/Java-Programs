package java_8_features;
import java.util.*;
public class ForEachMethodEx {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("Mumbai");
		al.add("Pune");
		al.add("Thane");
		al.add("Banglore");
		al.add("Chennai");
		al.add("Delhi");
		
		// forEach() method
		al.forEach(str->System.out.println(str));
	}

}
