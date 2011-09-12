package prashant.tc.SRM517;

import java.util.Set;
import prashant.lib.PrimeUtil;

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
			} else if (PrimeUtil.chkPrime(target)) {
				temp = new String("Yes");
			} else {
				int p=(int) Math.ceil(Math.sqrt(target));
				if(PrimeUtil.chkPrime(p)&& p*p==target && N>p*p ){
					while(N%p==0)N/=p;
					if(N==1){
						temp=new String("Yes");
					}
				}
			}
		}
			return temp;
	}

}
