package Arrays;

public class BinarySearchUnknownLength {

	public static int binarySearch(int[] array, int target) {

		boolean found = false;
		int i = 1;
		try {
			while (!found) {
				//System.out.println("1");
				if (array[i] == target) {
					//System.out.println("2");
					found = true;
				} else if(array[i] > target) {
					//System.out.println("3");
					found = true;
					i = binarySearch(array, 0, i, target);
				} else {
					//System.out.println(i);
					i *= 2;
				}
			}
			return i;
		} catch (ArrayIndexOutOfBoundsException e) {
			i /= 2;
			int result = crawl(array, i, target);
			return result;
		}

	}
	
	private static int crawl(int[] array, int start, int target) {
		try {
			int i = start;
			while (array[i] != target) {
				i++;
			}
			if (array[i] == target) {
				return i;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		return -1;
	}

	private static int binarySearch(int[] array, int s, int e, int t) {
		if (s <= e) {
			int m = (s + e) / 2;
			if (array[m] == t) {
				return m;
	          } else if (array[m] > t) {
				return binarySearch(array, s, m - 1, t);
			} else {
				return binarySearch(array, m + 1, e, t);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] array = {0, 1, 3, 5, 7, 9, 11, 13, 15, 18};
		System.out.println(binarySearch(array, 18));
	}
	
	
}
