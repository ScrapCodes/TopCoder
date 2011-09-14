package prashant.tc.SRM518;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestSubsequence {
		public String getLargest(String s){
			if(s.length()==1)
				return s;
			char []temp=s.toCharArray();
			Arrays.sort(temp);
			ArrayList<String> x=new ArrayList<String>();
			StringBuilder l1=new StringBuilder();
			int k=0;
			for(int i=(s.length()-1);i>=0;i--){
				
//				     l1.append(temp[i]);
//				     x.add(l1.toString());
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
			String[] l2=new String[1000];
			l2=x.toArray(new String[0]);
			Arrays.sort(l2);
			
//			return l2[l2.length-1];
			return l1.toString();
			
		}
}
