package study;

/*
사용자로 부터 임의의 정수를 입력받아
1부터 입력받은 수까지의 전체의 합계, 짝수의 합계, 홀수의 합을 각각 출력하는 프로그램을 구현하고
10단위로 합계를 출력하시오.
 */
import java.util.*;

public class 합계구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, evensum, oddsum, total;
		evensum = oddsum = total = 0;
		System.out.println("숫자를 입력해주세요.");
		i = sc.nextInt();

		for (int k = 1; k <= i; k++) {
			total = total + k;
			if(k%2==0) {
				evensum += k;
			}else {
				oddsum += k;
			}total = evensum+oddsum;
			if(k%10==0){
				System.out.printf("1부터%d까지의 짝수의 합은 %d\n", k, evensum);
				System.out.printf("1부터%d까지의 홀수의 합은 %d\n", k, oddsum);
				System.out.printf("1부터%d까지의 합은 %d\n", k, total);
			}
			
		}
		System.out.printf("1~%d 합 : %d",i, total);
		
		
	}
}
