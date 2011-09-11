package prashant.gcj;

import java.util.*;

import prashant.lib.FIO;

import prashant.lib.StringUtil;

public class MinimumScalarProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FIO fi = new FIO();
		StringUtil SU = new StringUtil();
		fi.fInit("C:\\Users\\prashant\\Desktop\\A-large-practice.in");
		String t = fi.finput();
		Integer N = Integer.parseInt(t);
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(fi.finput());
			List<Long> list = SU.parseArray(fi.finput());
			Collections.sort(list);
			List<Long> list2 = SU.parseArray(fi.finput());
			Collections.sort(list2);
			Long sum = 0l;
			for (int k = 0; k < n; k++) {
				sum += list.get(k) * list2.get(n - k - 1);
			}
			// IO.sop(new Integer(sum).toString());
			System.out.println("Case #"+(i+1)+": "+sum);
		}
	}
}
