package collections;
import java.util.*;
public class VectorEx {

	public static void main(String[] args) {

		Vector<String> vc = new Vector<String>();
		vc.addElement("Jasmin");
		vc.add("Rose");
		vc.add("Lily");
		vc.add("Mogra");
		vc.add("Rose");
		vc.add(null);
		vc.add("Mango");
		
		Enumeration<String> en= vc.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
