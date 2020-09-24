package practiseStringProg;

import java.util.StringTokenizer;

/**
 * reverse the String by word
 * 
 */
public class ReverseEachWordInString {
	public static void main(String[] args) {
		stringTokenizer("India is the best country");
	}
	
	private static void stringTokenizer(String str) {
		StringTokenizer strTokenizer = new StringTokenizer(str, " ");
		String revString = "";
		while (strTokenizer.hasMoreTokens()) {
			revString = strTokenizer.nextToken() + " " + revString;

		}
		System.out.println("revString ::" + revString);
	}

	

}
