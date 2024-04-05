package java_8_features;

@FunctionalInterface
interface Addable {
	int add(int a, int b);
}

public class LambdaExp1 {

	public static void main(String[] args) {
		Addable a1 = (x, y) -> x + y;
		System.out.println("add: " + a1.add(12, 2));

	}

}
