package Strings;

public class LongestSubstring2Chars {

	public static String longestSubstring2(String str) {
		//error handling here

		int maxLen = 0;
		char[] uniqueChars = new char[2];
		int count = 0;
		String maxString = "";

		for (int i = 0; i < str.length(); i++) {
			int end = -1;
			for (int j = i; j < str.length(); j++) {
				end = j;
				if (!contains(uniqueChars, str.charAt(j))) {
					if (count < 2) {
						uniqueChars[count++] = str.charAt(j);
					} else { //count >= 2
						int len = -1;
						if (j == str.length() - 1) {
							len = j + 1 - i;
						} else {
							len = j - 1;
						}  //ex. with "abcc", we've reached c.
						//i = 0, j = 2
						if (len > maxLen) {
							maxLen = len;
							maxString = str.substring(i, j);
						}
						count = 0;
						uniqueChars = new char[2];
						break;
					}
				}
			}
			int len = -1;
			if (end == str.length() - 1) {
				len = end + 1 - i;
				if (len > maxLen) {
					maxLen = len;
					maxString = str.substring(i, end + 1);
				}
			} else {
				len = end - 1;
				if (len > maxLen) {
					maxLen = len;
					maxString = str.substring(i, end);
				}
			}  //ex. with "abcc", we've reached c.
			//i = 0, j = 2
			
			uniqueChars = new char[2];
			count = 0;
		}
		return maxString;
	}
	
	private static boolean contains(char[] array, char target) {
		for (int i = 0; i < 2; i++) {
			if (array[i] == target) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String a = "abcddddeeeeeeeee";
		System.out.println(longestSubstring2(a));
	}
}
