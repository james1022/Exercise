package Misc;

import java.util.ArrayList;

public class PrintNumWithNoRepeatingDigits {

	public static void printNumbers(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			boolean[] digits = new boolean[10];
			int num = i;
			boolean noRepeats = true;
			while (num != 0) {
				int remainder = num % 10;
				if (digits[remainder]) {
					noRepeats = false;
					break;
				} else {
					digits[remainder] = true;
					num /= 10;
				}
			}
			if (noRepeats) {
				list.add(i);
			} 
		}
		printList(list);
	}

	private static void printList(ArrayList<Integer> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
			count++;
			if (count == 10) {
				System.out.println();
				count = 0;
			}
		}
	}
	
	
	public static void main(String[] args) {
		printNumbers(1000000);
	}
	
}
