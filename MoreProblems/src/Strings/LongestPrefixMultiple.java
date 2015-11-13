package Strings;
import java.util.ArrayList;

public class LongestPrefixMultiple {
	
	public static String largestPrefix(ArrayList<String> list) {
		if (list == null || list.size() == 0) {
			return null;
		}
	
		//Have the shortest string in the list be the main guy
		String shortest = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() < shortest.length()) {
				shortest = list.get(i);
			}
		}
	
		//iterate through each character in the main string while
		//comparing each of the characters at the same index in all other strings
		//break if any string has a mismatch.
		//start with index as -1 to indicate failure
		int index = -1;
		for (int i = 0; i < shortest.length(); i++) {
			boolean flag = true;
			char curr = shortest.charAt(i);
			for (int j = 0; j < list.size(); j++) {
					if (list.get(j).charAt(i) != curr) {
						flag = false;
						break;
					}
			}
			if (!flag) {
				break;
			} else {
				index = i;
			}
		}
		if (index == -1) {
			return "";
		} else {
			return shortest.substring(0, index + 1);
		}
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("abd");
		words.add("abdcded");
		words.add("abded");
		System.out.println(largestPrefix(words));
	}
	
}
