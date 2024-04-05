package exception_handling;
public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome !");
		try {
			int a=12/0;
			System.out.println("Division: "+a);
		}
		catch(Exception e){
			// TODO: handle exception
			System.out.println(e);
//			System.err.println(e);
//			e.printStackTrace();
		}
		System.out.println("The End !");
	}

}
