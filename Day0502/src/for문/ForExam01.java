package for문;
/*
[문제]
1~100까지의 정수 중에서 2, 3, 5, 7의 배수를 제외한 수를 항행에 
10개씩 출력하는 프로그램을 작성하시오.
 */
public class ForExam01 {

	public static void main(String[] args) {
		int a, b = 1;
		for(a = 1; a<101; a++) {
			if((a%2!=0)&&(a%3!=0)&&(a%5!=0)&&(a%7!=0)){
			System.out.printf("%3d%c ", a, (b++%10!=0) ?' ': '\n');
			}
		}
	}

}


