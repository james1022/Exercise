package Strings;
import java.util.HashSet;

public class RemoveRepeatedChars {

	public static String removeRepeats(String word) {
		HashSet<String> chars = new HashSet<>();
		String result = "";
		for (int i = 0; i < word.length(); i++) {
			String charAt = word.charAt(i) + "";
			if (!chars.contains(charAt)) {
				result += charAt;
				chars.add(charAt);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String word = "abbcadcdee";
		System.out.println(removeRepeats(word));
	}
	
}
