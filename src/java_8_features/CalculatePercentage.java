package java_8_features;
@FunctionalInterface
interface Percentage{
	public void calper(double m1,double m2,double m3);
}
public class CalculatePercentage {

	public static void main(String[] args) {
		Percentage p = (m1,m2,m3)->{
			double per = (m1+m2+m3)/3;
			System.out.println("Percentage : "+per);
			
		};
		p.calper(85, 89, 92);
	}

}
