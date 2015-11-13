package Strings;

import java.util.HashSet;

public class LongestSubstringUniqueChars {

	public static String longestSubstring(String s) {
		//error handling here
		int maxLen = 0;
		String maxString = "";
		for (int i = 0; i < s.length(); i++) {
			HashSet<String> map = new HashSet<>();
			int pointer = i;
			while (pointer < s.length() 
					&& !map.contains(s.charAt(pointer) + "")) {
						map.add(s.charAt(pointer) + "");
						pointer++;
			}
			int len = pointer - i;
			if (len > maxLen) {
				maxLen = len;
				maxString = s.substring(i, pointer);
			}
		}
		return maxString;

	}
	
	
	public static void main(String[] args) {
		System.out.println(longestSubstring("abcdeefghijjklmnopp"));
	}
	
}
