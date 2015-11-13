package Misc;
import java.util.HashMap;

public class FibonacciSequence {

	public static int fibonacci(int n) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 0);
		map.put(1, 1);
		return fibonacci(n, map);
	}

	private static int fibonacci(int n, HashMap<Integer, Integer> map) {
		if (map.containsKey(n)) {
			return map.get(n);
		} else {
			int result = fibonacci(n - 1) + fibonacci(n - 2);
			map.put(n, result);
			return result;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fibonacci(10));
	}
	
}
