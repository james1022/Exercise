package Arrays;
import java.util.*;

public class SumPairs {

	public static ArrayList<Pair> findPairs(int[] array, int n) {
		ArrayList<Pair> pairs = new ArrayList<>();
		HashSet<Integer> map = new HashSet<>();
		ArrayList<Integer> distinct = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (!map.contains(array[i])) {
				map.add(array[i]);
				distinct.add(array[i]);
			}
		}

		for (int i = 0; i < distinct.size(); i++) {
			int diff = n - distinct.get(i);
			if (map.contains(diff)) {
				pairs.add(new Pair(distinct.get(i), diff));
			}
		}
		return pairs;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		ArrayList<Pair> list = new ArrayList<>();
		list = findPairs(array, 11);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).a + " " + list.get(i).b);
		}
	}
}
