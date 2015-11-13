package Misc;

public class MultiplicationTable {

	public static void printMultiplicationTable(int n) {
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < 9; c++) {
				System.out.printf("%2d ", (r + 1) * (c + 1));
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printMultiplicationTable(9);
	}
	
}
