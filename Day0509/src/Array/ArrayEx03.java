package Array;

public class ArrayEx03 {
	
	public static void main(String[] args) {
		int aa[][] = new int[5][];
		
		int a = 1;

		for(int i = 0; i <aa.length; i++) {
			aa[i] = new int[i+1];
			for(int j = 0; j < aa[i].length; j++) {
				aa[i][j] = a;
				a++;
				System.out.print(aa[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		
	}

}
