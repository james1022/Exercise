package Misc;

public class Exponentiation {

	public static int ipow(int base, int exp) {
	    int result = 1;
	    
	    while (exp != 0) {
	        if ((exp & 1) == 1) { //exp % 2 == 1
	            result *= base;
	        }
	        exp >>= 1; //exp /= 2
	        base *= base;
	    }

	    return result;
	}
	
	public static void main(String[] args) {
		System.out.println(ipow(2, 3));
	}
	
}
