package java_8_features;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("Raj");
		al.add("Riya");
		al.add("Bhagyashree");
		al.add("Meera");
		al.add("Manas");
		al.add("Rishikesh");

		// without Stream API
		int count = 0;
		for (String string : al) {
			if (string.length() > 7) {
				count++;
			}
		}
		System.out.println("There are " + count + " strings with length greater than 7");

		// with Stream API
		long c = al.stream().filter(str -> str.length() > 7).count();
		System.out.println("Using Stream : There are " + c + " strings with length greater than 7");

		// 1 create a stream
		Stream<String> allNames = al.stream();

		// 2 perform intermediate operation
		Stream<String> longNames = allNames.filter(str -> str.length() > 7);

		// 3 perform terminal operation
		System.out.println("names with length greater than 7");
		longNames.forEach(str -> System.out.println(str));

		List<String> names = Arrays.asList("Raj", "Riya", "Bhagyashree", "Rishikesh", "Vyankatesh", "Paras", "Sonali");

		List<String> longNms = names.stream().filter(str -> str.length() > 5 && str.length() < 12)
				.collect(Collectors.toList());
		System.out.println("Using method reference and collector: ");
		longNms.forEach(System.out::println);
		
	}

}
