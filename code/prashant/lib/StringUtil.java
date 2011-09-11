package prashant.lib;

import java.util.*;
public class StringUtil {
	public List<Long> parseArray(String args){
		List<Long> li;
		String[] arr=args.split(" ");
		Long[] in=new Long[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			in[i]=Long.parseLong(arr[i]);
		}
		li=Arrays.asList(in);
		
		return li;
	}
}
