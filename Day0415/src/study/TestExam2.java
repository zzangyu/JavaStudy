package study;

import java.util.Scanner;

public class TestExam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int math, eg, kr ,total=0;
		double avg = 0;
		System.out.print("수학 점수를 아래에 입력하시오.");
		math = Integer.parseInt(sc.next());
		System.out.print("영어 점수를 아래에 입력하시오.");
		eg = Integer.parseInt(sc.next());
		System.out.print("국어 점수를 아래에 입력하시오.");
		kr = Integer.parseInt(sc.next());
		
		total = math + eg + kr;
		avg = total/3.0f; // 소수점 아래자리까지 확실하게 가져가기 위해 쓴거임. /3해도 된다.
		
		System.out.printf("평균 점수는 %.2f점이고 총점은 %d점이다.", avg, total);
		
		sc.close();

	}

}
