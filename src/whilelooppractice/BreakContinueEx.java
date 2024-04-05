package whilelooppractice;

public class BreakContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("Break Example :");
		for (i = 1; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Continue Example :");
		for (i = 1; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i+" ");
		}

	}

}
