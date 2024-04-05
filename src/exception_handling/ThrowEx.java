package exception_handling;

public class ThrowEx {
	public static void checkAge(int age) {
		if(age>=18) {
			System.out.println("Welcome to vote");
		}
		else {
			throw new ArithmeticException("age is not valid");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkAge(17);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("rest of code...");
		
	}

}
