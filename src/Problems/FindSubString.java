package Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindSubString {
	public static boolean infString(String infStr, String toFind) {
		if (toFind.length() < infStr.length() && !infStr.contains(toFind) ) {
			return false;
		}
		String replaceStr = infStr;
		while (replaceStr.length() < toFind.length() * 3) {
			replaceStr += infStr;
		}
		System.out.println(replaceStr);
		System.out.println(toFind.length());
		System.out.println(replaceStr.length());
		return replaceStr.contains(toFind);
	}

	public static void main(String[] args) throws  IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		String word[]=str.split(" ");
		String a = word[0];
		String b = word[1];
		if(infString(a,b)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
