package prashant.lib;

import java.util.Set;
import java.util.TreeSet;

/**
 * Utility class for Prime numbers
 * 
 * @author prashant
 */
public class PrimeUtil {
	
	/**
	 * Generate Unique primeFactors
	 * 
	 * @param num
	 * @return empty if no is prime.
	 */
	public static Set<Integer> primeFactors(int num) {

		Set<Integer> t = new TreeSet<Integer>();
		if (num < 2) {
			// t.add(2);
			return t;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (chkPrime(i)) {
				if (num % i == 0) {
					t.add(i);
					if ((i != num / i) && chkPrime(num / i))
						t.add(num / i);
					else
						t.addAll(primeFactors(num / i));
				}
			}
		}
		return t;
	}

	/**
	 * Deterministic Prime testing.
	 * 
	 * @param num
	 * @return
	 */
	public static boolean chkPrime(int num) {
		if (num==1) return false;
		if (num == 2 || num == 3)
			return true;
		if (num % 2 == 0)
			return false;
		else if (num % 3 == 0)
			return false;

		for (int i = 5; i * i <= num; i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
