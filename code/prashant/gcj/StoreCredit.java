package prashant.gcj;

/*
 * Problem

 You receive a credit C at a local store and would like to buy two items. You first walk through the store and create a list L of all available items. From this list you would like to buy two items that add up to the entire value of the credit. The solution you provide will consist of the two integers indicating the positions of the items in your list (smaller number first).

 Input

 The first line of input gives the number of cases, N. N test cases follow. For each test case there will be:

 One line containing the value C, the amount of credit you have at the store.
 One line containing the value I, the number of items in the store.
 One line containing a space separated list of I integers. Each integer P indicates the price of an item in the store.
 Each test case will have exactly one solution.
 Output

 For each test case, output one line containing "Case #x: " followed by the indices of the two items whose price adds up to the store credit. The lower index should be output first.

 Limits

 5 ≤ C ≤ 1000
 1 ≤ P ≤ 1000

 Small dataset

 N = 10
 3 ≤ I ≤ 100

 Large dataset

 N = 50
 3 ≤ I ≤ 2000

 Sample


 Input 
 3
 100
 3
 5 75 25
 200
 7
 150 24 79 50 88 345 3
 8
 8
 2 1 9 4 4 56 90 3
 Output
 Case #1: 2 3
 Case #2: 1 4
 Case #3: 4 5

 */


import prashant.lib.*;

public final class StoreCredit {

	/**
	 * @param args
	 */
	public static final void main(String[] args) throws Exception {

		// cos.printf("%s", temp);
		//IOshortcut IO = new IOshortcut();
		//String t = IO.input("");
		FIO fi =new FIO();
		fi.fInit("C:\\Users\\prashant\\Desktop\\A-large-practice.in");
		String t=fi.finput();
		Integer N = Integer.parseInt(t);
		for (int i = 0; i < N; i++) {
			t = fi.finput();
			int C = Integer.parseInt(t);
			t = fi.finput();
			int n = Integer.parseInt(t);
			t = fi.finput();
			String[] Items = t.split(" ");
			Integer[] items = new Integer[2001];
			for (int j = 0; j < n; j++) {
				items[j] = Integer.parseInt(Items[j]);
			}
			// List<Integer> itemList=Arrays.asList(items);
			// Collections.sort(itemList);
			int best = 0;
			int[] pos = new int[2];
			for (int j = 0; j < n - 1; j++)
				for (int k = j + 1; k < n; k++) {
					int temp = items[j] + items[k];
					if (temp <= C && temp > best) {
						best = temp;
						
						pos[0] = j;
						pos[1] = k;
						if (temp==C)break;
					}

				}
			System.out.println("Case #"+(i+1)+": "+(pos[0]+1)+" "+(pos[1]+1));
		}
		fi.fClose();
	}
}
