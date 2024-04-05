package exception_handling;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			try {
				String s="null";
				System.out.println(s.length());
			} catch (IndexOutOfBoundsException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}catch(NullPointerException e3){
				e3.printStackTrace();
			}
			try {
				String str="abc";
				System.out.println(Integer.parseInt(str));
			} catch (NumberFormatException e4) {
				// TODO: handle exception
				e4.printStackTrace();
			}
			System.out.println("Another Lines......");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Rest of code");
	}

}
