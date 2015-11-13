package Arrays;

public class LongestIncreasingInts2 {

	public static int longestChainWithOneVariable(int array[]) {
		
		if (array.length == 0) {
			return 0;
		}

		int maxLen = 1;

		for (int i = 1; i < array.length; i++) {
			System.out.println("i: " + i);
			for (int j = i; j < array.length; j++) {
				System.out.println("     j: " + j);
				if (array[j] == array[j - 1] + 1) {
					continue;
				} else {
					if (j - i + 1 > maxLen) {
						maxLen = j - i + 1;
					}
					i = j;
					break;
				}
			}
		}
		return maxLen;
		
	}
	
	public static void main(String[] args) {
		int[] array = {5, 2, 6, 5, 6, 7, 8, 9, 10, 5, 4, 3};
		System.out.println(longestChainWithOneVariable(array));
	}
}
