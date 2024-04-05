package Problems;

import java.util.Scanner;
import java.util.Scanner;// we can add twice but there is no use of it. And we can run and compile code successfully 

public class CountAm {
	int count = 0;

	public int countAm(String str) {
		String splitedStr[] = str.split(" ");
		for (int i = 0; i < splitedStr.length; i++) {
			if (splitedStr[i].equalsIgnoreCase("Am")) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CountAm obj = new CountAm();
		String s = sc.nextLine();
		int count = obj.countAm(s);
		System.out.println(count);

	}

}
