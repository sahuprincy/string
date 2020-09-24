package practiseStringProg;
/**
 * Check Hackerrank substring Present in the string*/
public class StringContainsSubstring {

	public static void main(String[] args) {
		boolean subStringContainsString = subStringContainsString("Hackerrank site is the best to learn programming language","Hackerrank");
		System.out.println("subStringContainsString:: "+subStringContainsString);
	}
	
	public static boolean  subStringContainsString(String actualStr,String inputString) {
		return actualStr.toLowerCase().contains(inputString.toLowerCase());
	}

}
