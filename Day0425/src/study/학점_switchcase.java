package study;

import java.io.*;

// 평균은 소수점
public class 학점_switchcase {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int S, math, kor, eng, his, sci;
		int total;
		float avrg;
		char grade;

		System.out.println("수학 점수를 입력 해주세요.");
		math = Integer.parseInt(br.readLine());
		System.out.println("영어 점수를 입력 해주세요.");
		eng = Integer.parseInt(br.readLine());
		System.out.println("국어 점수를 입력 해주세요.");
		kor = Integer.parseInt(br.readLine());
		System.out.println("역사 점수를 입력 해주세요.");
		his = Integer.parseInt(br.readLine());
		System.out.println("과학 점수를 입력 해주세요.");
		sci = Integer.parseInt(br.readLine());

		total = math + kor + eng + his + sci;
		avrg = total / 5f;

		switch ((int) avrg / 10) {
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.print("총점은 "+total+"점, "+"평균은 "+avrg+", ");
		System.out.println("학점은 "+grade+"입니다.");
	}
}
