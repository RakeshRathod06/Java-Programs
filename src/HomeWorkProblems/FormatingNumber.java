package HomeWorkProblems;

public class FormatingNumber {
	// input:  123.6259
	// output: 123.62
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a=123.6259f;
		System.out.printf("%.2f",a	);  // 123.63
		
		// but we want output as 123.62
		// so for that see .............
		
		System.out.println("\n"+Math.floor(a*100)/100);
			
	}

}
