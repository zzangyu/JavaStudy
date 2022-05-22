package for문;

/*
[문제]
국어, 영어, 수학 점수를 입력받아 총점과 평균 그리고 학점을 구하는 프로그램을 작성
학점: 100~90:A, 60점 이하는 F로 처리
평균은 소수점이하 두자리까지
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileEx02 {

	public static void main(String[] args) throws IOException {
		float avg = 0;
		char grade = 0 ;
		int math, eng, kor, total = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.print("국어 점수를 입력해주세요.");
			kor = Integer.parseInt(br.readLine());
		}while(kor<0||kor>100);
		do{
			System.out.print("수학 점수를 입력해주세요.");
			math = Integer.parseInt(br.readLine());
		}while(math<0||math>100);
		do {
			System.out.print("영어 점수를 입력해주세요.");
			eng = Integer.parseInt(br.readLine());
		}while(eng<0||eng>100);
		
			total = math + eng + kor;
			avg = total/3.0f;
		
		switch ((int)(avg/10)) {
		case 10:
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F'; break;

		}
			System.out.printf("총점 %d, 평균 %.2f, 학점 %c입니다.\n", total, avg, grade);

}

}
