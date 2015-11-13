package Misc;

import java.util.ArrayList;
import java.util.HashSet;

public class SetDifference {

	public static ArrayList<Integer> setDifference(int[] a, int[] b) {
		ArrayList<Integer> result = new ArrayList<>();
		HashSet<Integer> bSet = new HashSet<>();
		for (int i = 0; i < b.length; i++) {
			if (!bSet.contains(b[i])) {
				bSet.add(b[i]);
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (!bSet.contains(a[i])) {
				result.add(a[i]);
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		int[] a = {1, 3, 5, 7};
		int[] b = {1, 3, 5, 7};
		ArrayList<Integer> diff = setDifference(a, b);
		for (int i = 0; i < diff.size(); i++) {
			System.out.print(diff.get(i) + " ");
		}
	}
	
}
