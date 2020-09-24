package practiseStringProg;

import java.util.StringTokenizer;

/**
 * Count No of words in a String
 */
public class CountNoOfWordsInString {

	public static void main(String[] args) {
		int wordsCountUsingSplit = wordsCountUsingSplit("Java is a Programming language");
		System.out.println("wordsCountUsingSplit::" + wordsCountUsingSplit);

		int wordsCountUsingStringTokenizer = wordsCountUsingStringTokenizer("Java is a Programming language");
		System.out.println("wordsCountUsingStringTokenizer::" + wordsCountUsingStringTokenizer);

	}

	public static int wordsCountUsingSplit(String inputStr) {

		if (inputStr == null || inputStr.isEmpty()) {
			return 0;
		}
		String[] splittedString = inputStr.split("\\s+");
		return splittedString.length;
	}

	public static int wordsCountUsingStringTokenizer(String inputString) {
		StringTokenizer st = new StringTokenizer(inputString);
		return st.countTokens();
	}

}
