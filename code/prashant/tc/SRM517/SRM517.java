package prashant.tc.SRM517;

public class SRM517 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//MonochromaticBoard s=new MonochromaticBoard();
		String[] board=new String[5];
		board[0]="BBBBBBBB";
		board[1]="BBBBWBBB";
		board[2]="BBBBBBBB";
		board[3]="WBWBBBWB";
		board[4]="BBBBBBBB";
		//System.out.println(s.theMin(board));
		CompositeSmash s1=new CompositeSmash();
		
		
		System.out.println(s1.thePossible(65536, 256));
		System.out.println(s1.thePossible(517,47));
		System.out.println(s1.thePossible(8,4));
		System.out.println(s1.thePossible(5858,2));
		System.out.println(s1.thePossible(81461,2809));
		System.out.println(s1.thePossible(16,4));
		System.out.println(s1.thePossible(32,16));
	}
}
