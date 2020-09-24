package practiseStringProg;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Duplicate Characters in the String
 */
public class RemoveDuplicateCharactersInString {

	public static void main(String[] args) {
		String removeDuplicateCharacters = removeDuplicateCharacters("aabddede");
		System.out.println("removeDuplicateCharacters ::" + removeDuplicateCharacters);
	}

	private static String removeDuplicateCharacters(final String str) {

		if (str == null || str.isEmpty()) {
			return str;
		}
		Set<Character> set = new LinkedHashSet<>();
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			set.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (char c : set) {
			sb.append(c);
		}
		return sb.toString();

	}

}
