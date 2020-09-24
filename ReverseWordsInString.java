package practiseStringProg;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Reverse by Words of the String
 * 
 */

public class ReverseWordsInString {
	public static void main(String[] args) {
		reverseIndividualJava8("India is the best country");
		}
	private static void reverseIndividualJava8(String str) {
		String reversedString = Arrays.asList(str.split(" ")).stream().map(s -> new StringBuilder(s).reverse())
				.collect(Collectors.joining(" "));
		System.out.println("reversedbyWords ::" + reversedString);
	}
}
