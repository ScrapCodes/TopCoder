package prashant.tc.SRM517;

import java.util.Set;
import java.util.TreeSet;

public class CompositeSmash {

	/**
	 * @param N
	 * @param target
	 * @return Yes or No
	 * 
	 * @author prashant
	 */
	public String thePossible(int N, int target) {
		String temp = new String("No");
		// If target is prime. N should be divisible by target. which means
		// target is always achievable.
		Set<Integer> t1;
		if (N % target == 0) {
			if (N == target) {
				temp = new String("Yes");
			} else if (chkPrime(target)) {
				temp = new String("Yes");
			} else {
				int p=(int) Math.ceil(Math.sqrt(target));
				if(chkPrime(p)&& p*p==target && N>p*p ){
					while(N>1)N/=p;
					if(N==1){
						temp=new String("Yes");
					}
				}
			}
		}
			return temp;
	}
	
	/**
	 * Generate Unique primeFactors
	 * 
	 * @param num
	 * @return
	 */
	public Set<Integer> primeFactors(int num) {

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
	public boolean chkPrime(int num) {
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
