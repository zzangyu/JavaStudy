package study;

public class ����for��Ex04_�׸��� {

	public static void main(String[] args) {
		int i, j;
		for (i = 0; i < 5; i++) {

			for (j = 0; j < 6  ; j++) {
				System.out.print(j<=i?"*":"  ");
			}
			for(j = 0; j<5; j++) {
				System.out.print(5-j<=i+1?"*":"  ");
			}
//			for(j = i; j<6; j++) {
//				System.out.print(?:);
//				
//			}
// 				result = (i<j)?" ":"*";
//				System.out.print(result);
//		}
			
			System.out.println();
		}

	}
}
