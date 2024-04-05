package StringProblems;

import java.util.Arrays;

public class AnagramString {
	public boolean isAnagram(String str1, String str2) {
		String s1[] = str1.split("");
		String s2[] = str2.split("");
		Arrays.sort(s1);
		Arrays.sort(s2);
//		System.out.println(s1[0]);
//		System.out.println(s2[0]);
//		System.out.println(str1);
//		System.out.println(str2);
		int itr=0;
		for(int i=0;i<str1.length();i++) {
		if (str1.length() == str2.length() && s1[i].equals(s2[i])) {
			itr++;
		} 
		}
		if(itr==str1.length()) {
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnagramString obj = new AnagramString();
		if (obj.isAnagram("listen", "silent"))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");

	}

}
