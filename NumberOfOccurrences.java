package practiseStringProg;

import java.util.HashMap;
import java.util.Map;

/**
 * Number of Occurrence of each char and all char in the string
 */
public class NumberOfOccurrences {

	public static void main(String[] args) {
		long countOccurrencesOf = countOccurrencesOfSpecificCharacter("All is  going to be in your favour", 'o');
		System.out.println("countOccurrencesOfSpecificCharacter f:: " + countOccurrencesOf);

		countOccurrencesOfAllChar("All is  going to be in your favour");

	}

	private static long countOccurrencesOfSpecificCharacter(final String str, final char character) {
		// return str.codePoints().filter(ch -> ch == character).count();
		return str.chars().filter(ch -> ch == character).count();

	}

	private static void countOccurrencesOfAllChar(final String str) {

		HashMap<Character, Integer> charCountMap = new HashMap<>();
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
