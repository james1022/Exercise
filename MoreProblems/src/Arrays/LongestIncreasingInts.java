package Arrays;

public class LongestIncreasingInts {

	public static int longestChain(int[] array) {
		if (array.length == 0) {
			return 0;
		}
		int start = 0;
		int end = 0;
		int maxLength = 1;

		for (int i = 1; i < array.length; i++) {
			if (array[i] == (array[end] + 1)) {
				end = i;
			} else {
				int len = end - start + 1;
				if (len > maxLength) {
					maxLength = len;
				}
				start = i;
				end = i;
			}
		}
		int len = end - start + 1;
		if (len > maxLength) {
			maxLength = len;
		}
		return maxLength;
	}
	
	public static int longestChainWithOneVariable(int array[]) {
		
		if (array.length == 0) {
			return 0;
		}

		int maxLen = 1;

		for (int i = 1; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[j] == array[j - 1] + 1) {
					continue;
				} else {
					if (j - i + 1 > maxLen) {
						maxLen = j - i + 1;
					}
					break;
				}
			}
		}
		return maxLen;
		
	}
	
	public static void main(String[] args) {
		int[] array = {5,2,3,6,5, 6, 7, 8, 9, 5, 4, 3};
		System.out.println(longestChain(array));
		System.out.println(longestChainWithOneVariable(array));
	}
}
