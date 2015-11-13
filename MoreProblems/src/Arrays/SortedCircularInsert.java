package Arrays;

public class SortedCircularInsert {

	
	public static void insert(int[] array, int x, int start, int end) {
	
		//if array is empty, just insert without doing anything and return;
		//if array is full, expand the size by twofold and put the original
		//elements starting at index 0, and while doing this, insert the
		//new element in the appropriate position.
		//We can tell the empty/full case by checking if start == end,
		//but the problem is that we can't tell the difference between the two.
		//We will need to know the number of elements in these cases.
		
		int numElements = 0;
		if (end < start) {
			numElements += (array.length - start + end + 1);
		} else {
			numElements = end - start + 1;
		}
	
		int index = 0;
		for (int i = start; i < start + numElements; i++) {
			index = i % array.length;
			if (array[index] > x) {
				break;
		     } //else continue
		}
	
		if (index == end) {
			array[++index] = x;
		} else {
			//shift
			if (index > end) {
				int numBeforeLength = array.length - index;
				for (int i = end; i >= 0; i--) {
					array[i + 1] = array[i];
				}
				array[0] = array[array.length - 1];
				for (int i = index + numBeforeLength - 1; i > index; i--) {
					array[i] = array[i - 1];
				}
				array[index] = x;
			} else {
				if (end == array.length - 1) {
					array[0] = array[array.length - 1];
					for (int i = end - 1; i >= index; i--) {
						array[i + 1] = array[i];
					}
				} else {
					for (int i = end; i >= index; i--) {
						array[i + 1] = array[i];
					}
				}

				array[index] = x;
			}
		}
	}
	
	public static void printArray(int[] array) {
		System.out.print("{");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length - 1] + "}");
	}
	
	public static void main(String[] args) {
		int[] a = {1, 3, 4, 5, 6, 0, 0, 0}; //insert 2
//		printArray(a);
//		insert(a, 2, 0, 4);
//		printArray(a);
		
//		printArray(a);
//		insert(a, 7, 0, 4);
//		printArray(a);
		
		int[] b = {4, 5, 0, 0, 0, 0, 1, 2}; //insert 3
//		printArray(b);
//		insert(b, 3, 6, 1);
//		printArray(b);
		int[] c = {5, 6, 0, 0, 0, 1, 2, 4}; //insert 3
//		printArray(c);
//		insert(c, 3, 5, 1);
//		printArray(c);
		
		
		int[] d = {0, 1, 2, 4, 5, 6, 7}; //insert 3
		printArray(d);
		insert(d, 3, 1, 6);
		printArray(d);
	}
	
}
