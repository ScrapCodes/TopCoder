package prashant.tc;

public class MonochromaticBoard {
	public boolean chkelement(String ele) {
		boolean flag = true;
		for (int i = 0; i < ele.length(); i++) {
			if (ele.charAt(i) != 'B') {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public class A2Dchar {
		public char[][] Ab;
		public int x;
		public int y;

		public A2Dchar() {
			Ab = new char[1000][1000];
		}

		public void StringArrTo2DcharArr(String[] arr) {

			int i = 0;
			int k = 0;
			try {
				for (i = 0; arr[i] != null; i++) {
					for (k = 0; k < arr[i].length(); k++) {
						Ab[i][k] = arr[i].charAt(k);

					}
				}
			} catch (Exception e) {

			}
			this.x = i;
			this.y = k;

		}

	};

	public int theMin(String[] board) {
		int n = 0;
		A2Dchar temp = new A2Dchar();
		temp.StringArrTo2DcharArr(board);
		// Count the no of rows
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(temp.Ab[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < temp.x; i++) {
			int flag = 0;
			for (int j = 0; j < temp.y; j++) {
				if (temp.Ab[i][j] != 'B') {
					flag = 1;
				}
			}
			if (flag == 0) {
				for (int j = 0; j < temp.y; j++)
					temp.Ab[i][j] = 'K';
				n++;
			}
		}
		// Count the no of columns
		for (int i = 0; i < temp.x; i++) {
			int flag = 0;
			for (int j = 0; j < temp.y; j++) {
				if (temp.Ab[j][i] != 'B' && temp.Ab[j][i] != 'K') {
					flag = 1;
				}
			}
			if (flag == 0) {
				for (int j = 0; j < temp.y; j++)
					temp.Ab[j][i] = 'L';
				n++;
			}
		}
		// Count the remaining ones
		for (int i = 0; i < temp.x; i++) {

			for (int j = 0; j < temp.y; j++) {
				if (temp.Ab[i][j] == 'B') {
					n++;
				}
			}
		}
		return n;
	}
}
