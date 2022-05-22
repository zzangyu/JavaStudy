package study;

public class 이중for문Ex05_대각선 {

	public static void main(String[] args) {
		
		int i, j;
		String result;
		for(i = 1; i <= 5; i++) {
			
			for(j = 1; j <= 5; j++) {
//				if(i==j) {
//				System.out.printf("(%d, %d)", i, j);
//			}else {
//				System.out.print("        ");
//			}
			result=(i==j)?"(i, j)":"       ";
			System.out.print(result);
				
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
