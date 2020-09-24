package practiseStringProg;

import java.util.Arrays;

/**
 * Anagram or not
 */
public class Anagram {
private static void anagram(String str1, String str2) {
	String s1=str1.replaceAll("\\s", "");
	String s2=str2.replaceAll("\\s", "");
	
	boolean status =true;
	if(s1.length()!=s2.length()) {
		status=false;
	}else {
		char[] charArray1 = s1.toLowerCase().toCharArray();
		char[] charArray2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		status= Arrays.equals(charArray1, charArray2);
	}
	if(status) {
		System.out.println("Anagram");
	}else {
		System.out.println("String is not Anagram");
	}
	
}
	public static void main(String[] args) {
		anagram("keep","peek");
		anagram("Mother In Law","Hitler Woman");
		anagram("test","tstessg");
	}

}
