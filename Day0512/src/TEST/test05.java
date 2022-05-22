package TEST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제]
배열을 이용하여 한명의 학생에 대한 성적처리 프로그램을 작성한다.
과목 수 , 과목 명
이름도 입력
이름, 과목명, 총점, 평균, 학점
 */
public class test05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이름 ! ");
		String name = br.readLine();
		System.out.print("과목 몇개 ! ");
		int sr = Integer.parseInt(br.readLine());

		String[] subject = new String[sr];
		int score[] = new int[subject.length + 1];

		for (int i = 0; i < subject.length; i++) {
			System.out.print("과목 입력 - ");
			subject[i] = br.readLine();
		}
		if (subject.length == 0) {
			System.out.println("과목수가 없습니다.");
			System.exit(0);
		}
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "점수 입력 - ");
			score[i] = Integer.parseInt(br.readLine());
			score[score.length - 1] += score[i];
		}

		System.out.println("<<" + name + "님의 성적표>>");
		for (int i = 0; i < sr; i++) {
			System.out.println(subject[i] + " : " + score[i] + "점");
		}
		System.out.println("총점 : " + score[score.length - 1] + "점");
		System.out.println("평균 : " + (double) (score[score.length - 1] / subject.length) + "점");
		char grade = 0;
		switch ((score[score.length - 1] / subject.length) / 10) {
		case 10:
			grade = 'A';
			break;
		case 9:
			grade = 'B';
			break;
		case 8:
			grade = 'C';
			break;
		case 7:
			grade = 'D';
			break;
		case 6:
			grade = 'F';
			break;
		}
		System.out.println("학점 : " + grade);

	}

}
