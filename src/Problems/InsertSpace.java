package Problems;

import java.util.Scanner;

public class InsertSpace {
public String insertSpace(String str) {
	return str.chars().mapToObj(c->(char)c+" ").reduce("",String::concat).trim();
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		InsertSpace obj = new InsertSpace();
		String result = obj.insertSpace(str);
		System.out.println(result);
		
	}

}
