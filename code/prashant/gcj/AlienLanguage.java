package prashant.gcj;

import java.util.List;

import prashant.lib.*;

class permute {
	public int count(String[] str,int L,int k) {
		for(int i=0;i<L;i++)
		{
			
		}
		return 1;
	}
}

public class AlienLanguage {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// IOshortcut IO=new IOshortcut();
		StringUtil su = new StringUtil();
		SuffixTrie st = new SuffixTrie();
		FIO fi = new FIO();
		// IOshortcut IO= new IOshortcut();
		fi.fInit("C:\\Users\\prashant\\Desktop\\A-small-practice.in");
		String t = fi.finput();
		List<Long> list = su.parseArray(t);
		Long L = list.get(0);
		Long D = list.get(1);
		Long N = list.get(2);
		for (int i = 0; i < D; i++) {
			st.insert(fi.finput().trim());
		}
		// st.traverse(st.parent);
		// permute pm = new permute();
		for (int i = 0; i < N; i++) {
			String temp = fi.finput();
			String[] recvLang = new String[L.intValue()];
			int j = 0;
			for (int k = 0; k < temp.length(); k++) {
				if (temp.charAt(k) == '(') {
					k++;
					recvLang[j] = new String();
					for (; temp.charAt(k) != ')'; k++) {

						recvLang[j] += temp.charAt(k);
					}
					j++;
				} else {
					recvLang[j] = new String(temp.charAt(k) + "");
					j++;
				}
			}

			/*
			 * for(int l=0;l<L;l++) System.out.println(recvLang[l]);
			 */
		}

	}

}
