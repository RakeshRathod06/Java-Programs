package java_8_features;
@FunctionalInterface
interface Circle{
	public void circle(float r);
}
public class AreaOfCircle {

	public static void main(String[] args) {
		Circle c = (r)->{
			float pi=3.14f;
			System.out.println("Area of circle with radius "+r+" is "+pi*r*r);
		};
		c.circle(15.8f);
	}

}
