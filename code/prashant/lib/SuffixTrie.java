package prashant.lib;

public class SuffixTrie {
	class node {
		public node getChild(int n) {
			return child[n];
		}

		public void setChild(int n, node child) {
			this.child[n] = child;
		}

		public char getC() {
			return c;
		}

		public void setC(char c) {
			this.c = c;
		}

		/**
		 * A suffix trie can have maximum of 26 children each of an alphabetic
		 * character
		 */
		node[] child = new node[26];
		char c;
		int N;

		public node() {
			N = 0;
			
		}
	}

	public node parent;

	public SuffixTrie() {
		// Init
		if (parent == null) {
			parent = new node();
			parent.c = '1';

		}
	}

	public boolean  search(String str) {
		int len = str.length();
		int cnt = 0;
		if (len == 0)
			return false;

		node current = parent;

		while (cnt < len) {
			boolean flag = false;
			for (int i = 0; i < current.N; i++)
				// loop can be eliminated for efficiency by having concept of
				// counting sort
				if (current.child[i].c == str.charAt(cnt)) {
					current = current.child[i];
					flag = true;
					cnt++;
					break;
				}
			if (!flag) {
			return false;
			}
		}
		
		return true;
	}

	public void insert(String str) {
		int len = str.length();
		int cnt = 0;
		if (len == 0)
			return;

		node current = parent;

		while (cnt < len) {
			boolean flag = false;
			for (int i = 0; i < current.N; i++)
				// loop can be eliminated for efficiency by having concept of
				// counting sort
				if (current.child[i].c == str.charAt(cnt)) {
					current = current.child[i];
					flag = true;
					cnt++;
					break;
				}
			if (!flag) {
				current.N++;
				current.child[current.N - 1] = new node();
				current.child[current.N - 1].c = str.charAt(cnt);
			}
		}
	}

	public void traverse(node curr) {
		
		for(int i=0;i<curr.N;i++)
		{
			System.out.print(curr.child[i].c+" ");
		}
		System.out.println("");
		for(int i=0;i<curr.N;i++)
		{
			traverse(curr.child[i]);
		}
	}

	public void prune() {
	}
}
