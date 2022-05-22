package study;

public class 이중for문Ex03_그림그리기 {

	public static void main(String[] args) {
		String result;
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
//			result = (i<=j)?"*":"  ";
//			System.out.print(result);
//			}
			System.out.println();
		}

	}

}
//if랑 삼항연산자로 풀기