package practiseStringProg;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Duplicate Characters in the String
 */
public class DuplicateCharactersInString {

	public static void main(String[] args) {
		duplicateCharacters("aabddede");
	}

	private static void duplicateCharacters(final String str) {

		HashMap<Character, Integer> charCountMap = new HashMap<>();
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> uniqueCharacter = charCountMap.entrySet();
		for (Map.Entry<Character, Integer> set : uniqueCharacter) {
			if (set.getValue() > 1) {
				System.out.println("Key " + set.getKey() + " Value " + set.getValue());
			}
		}

	}

}
