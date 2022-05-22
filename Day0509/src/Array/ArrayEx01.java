package Array;

public class ArrayEx01 {

	public static void main(String[] args) {
		int aa[][] = new int[3][4];
		int a = 0;
		
		for(int i = 0; i<=aa.length-1; i++) {
			for(int j = 0; j<=aa[i].length-1; j++) {
				aa[i][j] = a;
				System.out.print(aa[i][j]+"\t");
				a++;
			}
			System.out.println();
		} 
		
		
		
	}

}
