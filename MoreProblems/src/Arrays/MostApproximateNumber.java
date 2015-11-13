package Arrays;

import java.util.ArrayList;

public class MostApproximateNumber {

	public static int search(int[] array, int target) {
		int start = 0;
		int end = array.length - 1;
		ArrayList<Integer> candidates = new ArrayList<>();
		while (start <= end) {
			int mid = (start + end) / 2;
			if (array[mid] == target) {
				return array[mid];
			} else if (array[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			candidates.add(array[mid]);
		}
		int[] differences = new int[candidates.size()];
		for (int i = 0; i < candidates.size(); i++) {
			differences[i] = Math.abs(target - candidates.get(i));
		}
		int minIndex = 0;
		for (int i = 0; i < differences.length; i++) {
			if (differences[i] < differences[minIndex]) {
				minIndex = i;
			}
		}
		return candidates.get(minIndex);
	}
	
	public static void main(String[] args) {
		int[] array = {1, 7, 10, 14, 19, 23, 25, 27};
		System.out.println(search(array, 10));
	}
	
}
