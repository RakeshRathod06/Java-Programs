package java_8_features;
@FunctionalInterface
interface SimpleInterest{
	public void calInterest(float p,float n,float r);
}
public class FindSimpleInterest {

	public static void main(String[] args) {
		SimpleInterest i = (p,n,r)->{
			float si=(p*n*r)/100;
			System.out.println("Simple Interest: "+si);
		};
		i.calInterest(15500.36f, 4.0f, 6.5f);
	}

}
