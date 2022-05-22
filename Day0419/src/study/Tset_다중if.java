package study;

/*
[문제]
5개의 과목의 점수를 입력받아서 총점과 평균을 구하고 평균을 이용하여 학점을 판정하는 프로그램을 구현하시오.
단, 학점은 A(90점 이상), B(80점 이상), C(70점 이상), D(60점 이상), F(60점 미만)
 */

import java.util.*;

public class Tset_다중if {

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
		

		
		if(avrg>=90) {
			grade = 'A';
			System.out.print("당신의 과목점수는 국어점수: "+kor+" 수학점수: "+math+" 영어점수: "+eng+" 과학점수: "+sci+" 국사점수: "+his+"이며,"+"총점: "+total+", "+"평균: "+avrg+","+"학점: "+grade+"입니다.");
		}else if (avrg>=80) {
			grade = 'B';
			System.out.println("당신의 과목점수는 국어점수: "+kor+" 수학점수: "+math+" 영어점수: "+eng+" 과학점수: "+sci+" 국사점수: "+his+"이며,"+"총점: "+total+", "+"평균: "+avrg+","+"학점: "+grade+"입니다.");
		}else if (avrg>=70) {
			grade = 'C';
			System.out.println("당신의 과목점수는 국어점수: "+kor+" 수학점수: "+math+" 영어점수: "+eng+" 과학점수: "+sci+" 국사점수: "+his+"이며,"+"총점: "+total+", "+"평균: "+avrg+","+"학점: "+grade+"입니다.");
		}else if (avrg>=60) {
			grade = 'D';
			System.out.println("당신의 과목점수는 국어점수: "+kor+" 수학점수: "+math+" 영어점수: "+eng+" 과학점수: "+sci+" 국사점수: "+his+"이며,"+"총점: "+total+", "+"평균: "+avrg+","+"학점: "+grade+"입니다.");
		}else if (avrg<60) {
			grade = 'F';
			System.out.println("당신의 과목점수는 국어점수: "+kor+" 수학점수: "+math+" 영어점수: "+eng+" 과학점수: "+sci+" 국사점수: "+his+"이며,"+"총점: "+total+", "+"평균: "+avrg+","+"학점: "+grade+"입니다.");
		
			
			
		}
		
		

	}

}
