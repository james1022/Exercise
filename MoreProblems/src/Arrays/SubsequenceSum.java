package Arrays;
import java.util.ArrayList;

public class SubsequenceSum {

	public static ArrayList<Pair> sumPath(int[] array, int target) {
		ArrayList<Pair> pathPairs = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for (int j = i; j >= 0; j--) {
				sum += array[j];
				if (sum == target) {
					Pair p = new Pair(i, j);
					pathPairs.add(p);
				}
			}
		}
		return pathPairs;
	}
	
	public static ArrayList<Pair> sumPath2(int[] array, int target) {
		ArrayList<Pair> pathPairs = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for (int j = i; j < array.length; j++) {
				sum += array[j];
				if (sum == target) {
					Pair p = new Pair(i, j);
					pathPairs.add(p);
				}
			}
		}
		return pathPairs;
	}

	public static void main(String[] args) {
		int[] array = {1, 4, 6, 3, 7, 5, 1, -1, 1, 9, 9, 1, -1, 1, 11, 3, 5, 1, 6, 3, 6, 7, 8};
//		ArrayList<Pair> pathPairs = sumPath(array, 10);
//		for (int i = 0; i < pathPairs.size(); i++) {
//			System.out.println("start: " + pathPairs.get(i).b + ", end: " + pathPairs.get(i).a);
//		}
		ArrayList<Pair> pathPairs = sumPath2(array, 10);
		for (int i = 0; i < pathPairs.size(); i++) {
			System.out.println("start: " + pathPairs.get(i).a + ", end: " + pathPairs.get(i).b);
		}
	}
	
	
}
