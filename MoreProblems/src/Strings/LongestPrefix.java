package Strings;

public class LongestPrefix {

	public static String longestPrefix(String s1, String s2) {
		if (s1 == null || s2 == null) {
			return null;
		}
		String prefix = "";
		int minLen = Math.min(s1.length(), s2.length());
		for (int i = 0 ; i < minLen; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				prefix += s1.charAt(i);
			} else {
				break;
			}
		}
		return prefix;
	}
	
	public static void main(String[] args) {
		String s1 = "abbreviate";
		String s2 = "abbrwatermelon";
		System.out.println(longestPrefix(s1, s2));
	}
	
}
