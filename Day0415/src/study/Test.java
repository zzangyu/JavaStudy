package study;
/*  
	[문제] 국어, 영어, 수학이 있다. 세 과목의 임의의 점수를 입력 받아서 총점과 평균을 출력하는 프로그램을 구현하시오.
	단, 평균은 소수 2자리까지 출력한다.
	입력은 scanner
 */
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	double math, eg, kr, av, total;
	
	System.out.println("수학 점수는 : ");
	math = sc.nextDouble();
	System.out.println("영어 점수는 : ");
	eg = sc.nextDouble();
	System.out.println("국어 점수는 : ");
	kr = sc.nextDouble();
	
	av = (math + eg + kr)/3;
	total = math + eg + kr;

	System.out.printf("평균 점수는 %.2f점, 총점은 %.0f점이다.", av, total);
	
	
	
	
	
		
	}

}
