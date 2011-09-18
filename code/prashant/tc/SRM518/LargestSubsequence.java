package prashant.tc.SRM518;

import java.util.Arrays;

public class LargestSubsequence {
		public String getLargest(String s){
				char []temp=s.toCharArray();
			Arrays.sort(temp);
//			ArrayList<String> x=new ArrayList<String>();
			StringBuilder l1=new StringBuilder();
			int k=0;
			/*I made a mistake here while submitting in condition i>=0 i submitted with i>0 so failed*/
			for(int i=(s.length()-1);i>=0;i--){
				
				boolean flag=false;
				for(int j=k;j<s.length();j++)
					if(s.charAt(j)==temp[i]){
						k=j+1;
						flag=true;
						break;
					}
				if(flag)
				l1.append(temp[i]);
				
			}
			
			return l1.toString();
			
		}
}
