package whilelooppractice;

public class CheckArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 370;
		int rem=0;
		int sum=0;
		int original=n;
		while(n>0) {
			rem=n%10;
			sum = sum+(rem*rem*rem);
			n=n/10;
		}
		System.out.println();
		if(original==sum) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
		
	}

}
