package prashant.tc.SRM518;

public class TwiceString {
	public String getShortest(String s) {
		StringBuilder newString=new StringBuilder(s);
		char []temp=new char[101];
		temp=s.toCharArray();
		char []temp2=new char[101];

		int j=0;
		int i=0;
		for (i=1;i<s.length();i++)
		{
			
			for (j=0;j<(s.length()-i);j++){
	
				if(temp[i+j]==temp[j]){
					continue;
				}
				else break;
			}
			if(i+j==s.length())
			{
				break;
			}
		}
		
		String out=new String();
		out=s.substring(0,i)+s;
		
		return out;

	}

}
