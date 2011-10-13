package prashant.tc.SRM521;


public class RedAndGreen {
	public int minPaints(String row){
		int count=0;
		int[] rLeft =new int[50];
		int[] rRight =new int[50];
		int[] gLeft =new int[50];
		int[] gRight =new int[50];
		for(int i=0;i<row.length();i++){
			rLeft[i]=0;
			gLeft[i]=0;
			rRight[i]=0;
			gRight[i]=0;
			for(int j=i+1;j<row.length();j++){
				if(row.charAt(j)=='R')
				{
					rRight[i]++;
				}
				if(row.charAt(j)=='G')
				{
					gRight[i]++;
				}
			}
			for(int j=i-1;j>=0;j--){
				if(row.charAt(j)=='R')
				{
					rLeft[i]++;
				}
				if(row.charAt(j)=='G')
				{
					gLeft[i]++;
				}
			}

		}
//		System.out.println(Arrays.toString(rLeft));
//		System.out.println(Arrays.toString(rRight));
//		System.out.println(Arrays.toString(gLeft));
//		System.out.println(Arrays.toString(gRight));
		//find count
		//char [] row_char=row.toCharArray();
		for(int i=0;i<row.length();i++){
			char T=row.charAt(i);
			if(T=='R' && gLeft[i]>0){
				if(gLeft[i]>=gRight[i] &&(rRight[i]+1)>(rLeft[i]) ){
					count++;
					//row_char
					for(int k=i+1;k<row.length();k++){
						rLeft[k]--;
						gLeft[k]++;
					}
					for(int k=i-1;k>=0;k--){
						rRight[k]--;
						gRight[k]++;
					}
				}
			
			}
			if(T=='G' && rRight[i]>0){
				if(rRight[i]>=rLeft[i] && (gRight[i]+1)<gLeft[i] ){
					//row_char
					count++;
					for(int k=i+1;k<row.length();k++){
						rLeft[k]++;
						gLeft[k]--;
					}
					for(int k=i-1;k>=0;k--){
						rRight[k]++;
						gRight[k]--;
					}
				}
				else
				{
					
				}
			}
		}
		return count;
	}
}
