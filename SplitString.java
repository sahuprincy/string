package practiseStringProg;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Split String
 **/
public class SplitString {

	public static void main(String[] args) {
		String[] programmingLanguages = { "HackerRank, is", "best", "way", "to learn" };

		String splitStringjava8 = joiningStringjava8(programmingLanguages);
		System.out.println(splitStringjava8);

		splitStringjava("Learning Code");

	}

	public static String joiningStringjava8(String[] string) {
		return Arrays.asList(string).stream().collect(Collectors.joining(" "));
	}

	public static void splitStringjava(String str) {
		String[] arrOfStr = str.split(" ");

		for (String a : arrOfStr)
			System.out.println(a);
	}

}
