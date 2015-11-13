package Strings;

public class Substring {

	public static String substringJC(String s, int start) {
		if (s == null) {
			return null;
		} else if (start >= s.length()) {
			return null;
		}
		char[] sArray = s.toCharArray();
		int numChars = s.length() - start;
		char[] result = new char[numChars];
			for (int i = 0; i < numChars; i++) {
				result[i] = sArray[start + i];
		}
		return new String(result);
	}
	
	public static String substringJC(String s, int start, int end) {
		if (s == null) {
			return null;
		} else if (start >= s.length()) {
			return null;
		}
		char[] sArray = s.toCharArray();
		int numChars = end - start;
		char[] result = new char[numChars];
		for (int i = 0; i < numChars; i++) {
			result[i] = sArray[start + i];
		}
		return new String(result);
		}
	
	public static void main(String[] args) {
		String a = "abcde";
		System.out.println(substringJC(a, 1));
		System.out.println(substringJC(a, 0, 3));
	}
	
}
