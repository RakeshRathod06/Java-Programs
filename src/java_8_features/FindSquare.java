package java_8_features;
@FunctionalInterface
interface Square{
	public void square(int n);
}
public class FindSquare {

	public static void main(String[] args) {
		Square s = (a)->{
			System.out.println("square of the given Number "
					+ ""+a+" is "+a*a);
		};
		s.square(12); 
	}

}
