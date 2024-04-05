package exception_handling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("case 1: Where exception dosent occur ");
		try {
			int a = 10 / 2;
			System.out.println("Div: " + a);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			System.out.println("case 1: Always Executes");
		}

		System.out.println("case 2 where exception occurs and handles");

		try {
			int a = 15 / 0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("case 2: Always Executes");
		}

		System.out.println("case 3 where exception occurs and does not handled");

		try {
			String s = null;
			System.out.println(s.length());
//		} catch (NullPointerException e) {
//			e.printStackTrace();
		} finally {
			System.out.println("case 3:Always Executes");
		}

		System.out.println("Rest of the code");
	}

}
