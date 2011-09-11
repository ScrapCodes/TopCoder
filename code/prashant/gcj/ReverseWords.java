package prashant.gcj;

import prashant.lib.FIO;
import prashant.lib.IOshortcut;

public class ReverseWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FIO fi =new FIO();
		IOshortcut IO= new IOshortcut();
		fi.fInit("C:\\Users\\prashant\\Desktop\\B-large-practice.in");
		String t=fi.finput();
		Integer N = Integer.parseInt(t);
		for (int i = 0; i < N; i++) {
			t=fi.finput();
			String[] arr= t.split(" ");
			System.out.print("Case #"+(i+1)+": ");
			for(int k=((arr.length));k>=1;k--)
			{
				System.out.print(arr[k-1]+" ");
			}
		}
		IO.sop("");

	}

}
