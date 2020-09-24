package practiseStringProg;

import java.util.HashMap;

/**
 * First Non Repeated Characters in the String 
 */
public class NonRepeatedCharacters {

	public static void main(String[] args) {
		
		firstNonRepeatedCharacters("All is  going to be in your favour");

	}

	

	private static void firstNonRepeatedCharacters(final String str) {

		HashMap<Character, Integer> charCountMap = new HashMap<>();
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		for(char c: charArray) {
			if(charCountMap.get(c) ==1) {
				System.out.println("First Non Repeated Character"+ str +" "+ c);
				break;
			}
		}
		
		for(char c: charArray) {
			if(charCountMap.get(c) >1) {
				System.out.println("First Repeated Character"+ str +" "+ c);
				break;
			}
		}

	}

}
