package StringProblems;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="welcome";
		String s2="hello",s3="Welcome",s4="   Welcome to Edubridge    ";
		System.out.println("Character at 3rd position: "+s1.charAt(3));
		System.out.println("Length: "+s1.length());
		System.out.println("substring: "+s1.substring(3));
		System.out.println("substring: "+s3.substring(2,4));
		System.out.println("s1.contains(): "+s1.contains("e"));
		System.out.println("s1.contains(): "+s1.contains("etm"));
		System.out.println("s1.equals(s3)): "+s1.equals(s3));
		System.out.println("s1.equalsIgnoreCase(s3)): "+s1.equalsIgnoreCase(s3));
		
		System.out.println("isEmpty(): "+s2.isEmpty());
		
		System.out.println("s3.indexOf(): "+s3.indexOf("e"));
		System.out.println("s3.lastIndexOf()"+s3.lastIndexOf("e"));
		

		

	}

}
