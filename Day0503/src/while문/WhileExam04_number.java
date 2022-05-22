package while문;
/*
[문제]
-50에서 1까지의 수를 출력하는 프로그램
단, 한줄에 5개씩만 출력하고, 이 수들 사이를 탭 간격으로 띄우시오.
 */

public class WhileExam04_number {

	public static void main(String[] args) {
		int a = -50, i = 1;
		
		while(a<2) {
			while(i==6) {
				i = 1;
				System.out.println();
			}
			System.out.print(a+"\t");
			a++;
			i++;
		}

	}

}
