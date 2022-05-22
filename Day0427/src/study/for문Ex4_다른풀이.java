package study;
/*
[문제]
양의 점수만 입력받아 입력받은 합의 평균을 구하는 프로그램을 구형
단, 음의 실수가 입력되면 계산하시오.
양의 실수 입력 : 1.1
양의 실수 입력 : 2.2
양의 실수 입력 : 3.3
양의 실수 입력 : 4.4
양의 실수 입력 : -5.5
지금까지의 평균 : 2.2
*/
import java.util.*;
public class for문Ex4_다른풀이 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float input, total, count;
	input = total =  count = 0.0f;
	
	for(;input>=0;) {
		total = total + input;
		System.out.println("실수를 입력해주세요.");
		input = sc.nextFloat();
		count++;
		}

	System.out.printf("평균은 %.1f", total/count);
	}
}
