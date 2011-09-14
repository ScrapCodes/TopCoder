package prashant.tc.SRM518;

public class SRM518 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwiceString t= new TwiceString();
		System.out.println(t.getShortest("aba"));
		System.out.println(t.getShortest("xxxxx"));
		System.out.println(t.getShortest("topcoder"));
		System.out.println(t.getShortest("abracadabra"));
		System.out.println(t.getShortest("abracabrababra").length());
		LargestSubsequence n = new LargestSubsequence();
		System.out.println(n.getLargest("test"));
		System.out.println(n.getLargest("ksljdhfakjsdfhakjsdhfkjlashdfhalskjdfhas dfkjahsdfsfasdt"));
		System.out.println(n.getLargest("sttte"));
		System.out.println(n.getLargest("aquickbrownfoxjumpsoverthelazydog"));
	}	

}
