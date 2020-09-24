package practiseStringProg;

/**
 * Reverse the String
 * 
 */
public class ReverseString {

	public static void main(String[] args) {
		reverseIndividual("India is the best country");
		reverseIndividualStringBuffer("India is the best country");
	}

	private static void reverseIndividual(String str) {
		String reversedString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedString = reversedString + str.charAt(i);
		}
		System.out.println("reverseIndividual ::" + reversedString);
	}

	private static void reverseIndividualStringBuffer(String str) {
		StringBuffer stringBuffer = new StringBuffer(str);
		System.out.println("stringBuffer reverseIndividual  ::" + stringBuffer.reverse());
	}
}
