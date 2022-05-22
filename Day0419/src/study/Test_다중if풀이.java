package study;

import java.util.*;

public class Test_다중if풀이 {

	public static void main(String[] args) {
		
		int kor, math, eng, sci, his, total=0, avrg=0;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수학의 점수를 입력하시오.: ");
		math = sc.nextInt();
		System.out.print("국어의 점수를 입력하시오.: ");
		kor = sc.nextInt();
		System.out.print("영어의 점수를 입력하시오.: ");
		eng = sc.nextInt();
		System.out.print("과학의 점수를 입력하시오.: ");
		sci = sc.nextInt();
		System.out.print("국사의 점수를 입력하시오.: ");
		his = sc.nextInt();
		
		total = kor + math + eng + sci + his;
		avrg = total/5;
		
		//밑에 if문 채워 넣어봐라~ 
	}
}