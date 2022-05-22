package for문;
/*
[문제]
사용자가 입력하는 정수를 계속해서 더해 나간다.
만약에 0이 입력되면 지금까지 입력된 정수의 합계를 출력하고 종요하는 프로그램을 구현하시오.
단, while문 이용
 */
import java.util.Scanner;
public class WhileEx01 {

	public static void main(String[] args) {
		int a, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력해주세용~ ☞ ");
			a = sc.nextInt();
			
			if(a!=0) {
				sum += a;
				System.out.println("현재 입력 된 정수들의 합은 "+sum+"입니다.");
			}else {
				break;
			}
			
		}System.out.print("0이 입력되어 종료됩니다. 입력 된 정수들의 합은 "+sum+"입니다.");
		
		
		
	}

}
