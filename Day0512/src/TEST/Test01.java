package TEST;

public class Test01 {

	public static void main(String[] args) {
		// 배열의 크기는 5,5
		int[][] aa = new int[5][5];
		int n = 1;
		for (int i = 0; i < aa.length; i++) {
			// 1) n = i + 1;
			for (int j = 0; j < aa[i].length; j++) {
				aa[i][j] = n;
				n++;
				System.out.printf("%d\t", aa[i][j]);
			}
			// 2) n = n - 4;
			// 3) n = i + 2;
			System.out.println();
		}

	}

}
