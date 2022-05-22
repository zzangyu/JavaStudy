package DoWhile문;
/*
[문제]
사용자로부터 하나의 숫자를 입력받은 다음, 그 수만큼 3의 배수를 출력하는 프로그램 작성
만약에 사용자로부터 5를 입력받았다면 3, 6, 9, 12, 15를 출력하시오.
 */
import java.util.Scanner;

public class DoWhileEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i=1, limit;
		System.out.print("숫자를 입력해주세용~ - ");
		limit = sc.nextInt();
		do {
			System.out.print(i * 3+"  ");
			i++;	
			}while(i<=limit);
		
	}

}