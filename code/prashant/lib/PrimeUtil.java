package prashant.lib;

import java.util.Vector;

/**
 * Utility class for Prime numbers
 * 
 * @author prashant
 */
public class PrimeUtil {
	/**
	 * Generate Unique prime factors.
	 * 
	 * @param num
	 * @return Vector of unique prime factors
	 */
	public Vector<Integer> primeFactors(int num) {
		Vector<Integer> t = new Vector<Integer>();
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (chkPrime(i)) {
				if (num % i == 0) {
					t.add(i);
					if ((i != num / i) && chkPrime(num / i))
						t.add(num / i);
				}
			}
		}
		return t;
	}

	/**
	 * Deterministic Prime testing.
	 * 
	 * @param num
	 * @return wether true or false
	 */
	public boolean chkPrime(int num) {
		if (num == 2 || num == 3)
			return true;
		if (num % 2 == 0)
			return false;
		else if (num % 3 == 0)
			return false;

		for (int i = 5; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

}
