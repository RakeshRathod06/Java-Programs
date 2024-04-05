package exception_handling;

public class MultipleCatch {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[7]=25/2;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("rest of code...........");
	}
}
