package prashant.lib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOshortcut {
	//Console console = System.console();
	
	public String input(String args)
	{
		String tmp=new String();
		try{
		System.out.print(args);
		BufferedReader temp=new BufferedReader(new InputStreamReader(System.in));
		tmp=temp.readLine();
		
		}
		catch(IOException ioe){
			System.out.println("Exception at input "+ioe.getMessage());
		}
		return tmp;
	}
	public void sop(String Args)
	{
		System.out.println(Args);
	}
}
