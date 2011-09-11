
package prashant.tc;

public class SRM517 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonochromaticBoard s=new MonochromaticBoard();
		String[] board=new String[5];
		/*
		BBBBBBBB",
		 "BBBBBBBB",
		 "BBBBBBBB",
		 "WBWBBBWB",
		 "BBBBBBBB"}*/
		board[0]="BBBBBBBB";
		board[1]="BBBBWBBB";
		board[2]="BBBBBBBB";
		board[3]="WBWBBBWB";
		board[4]="BBBBBBBB";
		System.out.println(s.theMin(board));
	}

	
}
