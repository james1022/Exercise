package Strings;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWordOrder {

	public static String reverseWordOrder(String orig) {
		if (orig == null) {
			return null;
		} else if (orig.isEmpty()) {
			return "";
		}
	
		ArrayList<String> words = new ArrayList<>();
		Scanner sc = new Scanner(orig);
		while (sc.hasNext()) {
			String nextWord = sc.next();
			words.add(nextWord);
		}
		String result = "";
		for (int i = words.size() - 1; i >= 0; i--) {
			result += words.get(i);
			result += " ";
		}
		return result;
	}
	
	
	
	
	public static void main(String[] args) {
		String orig = "hello there people";
		String newWord = reverseWordOrder(orig);
		System.out.println(newWord);
	}
}
