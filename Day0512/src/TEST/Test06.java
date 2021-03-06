package TEST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("사람 수 입력");
		int human = Integer.parseInt(br.readLine());
		String[] humanName = new String[human];
		for (int i = 0; i < human; i++) {
			System.out.print((i + 1) + "번째 사람 이름 ! ");
			humanName[i] = br.readLine();
		}
		System.out.println(humanName[0] + "님의 과목 몇개!");
		int b = Integer.parseInt(br.readLine());
		int[] sibal = new int[b];
		sibal[0] = b;

		String[][] subject = new String[human][];

		for (int j = 1; j < human; j++) {
			System.out.print(humanName[j] + "님의 과목 몇개 ! ");
			sibal[j] = Integer.parseInt(br.readLine());
		}

		int sum[] = new int[human];
		int score[][] = new int[human][subject.length];
		float[] avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];

		for (int i = 0; i < human; i++) {
			subject[i] = new String[sibal[i]];
			for (int j = 0; j < subject[i].length; j++) {
				System.out.print(humanName[i] + "의 " + (j + 1) + "번째 응시 과목 입력 - ");
				subject[i][j] = br.readLine();
			}
		}
		for (int i = 0; i < human; i++) {
			sum[i] = 0;
			score[i] = new int[sibal[i]];
			for (int j = 0; j < subject[i].length; j++) {
				System.out.print(humanName[i] + "의 " + subject[i][j] + "점수 입력 - ");
				score[i][j] = Integer.parseInt(br.readLine());
				sum[i] += score[i][j];
				avg[i] = sum[i] / sibal[i];
			}

		}
		for (int i = 0; i < human; i++) {
			switch ((int) (avg[i] / 10)) {
			case 10:
				grade[i] = 'A';
				break;
			case 9:
				grade[i] = 'B';
				break;
			case 8:
				grade[i] = 'C';
				break;
			case 7:
				grade[i] = 'D';
				break;
			case 6:
				grade[i] = 'F';
				break;
			}
		}

		for (int i = 0; i < human; i++) {
			System.out.print(humanName[i] + "  ");
			for (int j = 0; j < subject[i].length; j++) {
				System.out.print(subject[i][j] + "점수: " + score[i][j] + "점  ");
			}
			System.out.print("총점: " + sum[i] + "점  ");
			System.out.print("평균: " + sum[i] / subject[i].length + "점  ");
			System.out.printf("학점: %c \n", grade[i]);
		}
		System.out.println();
	}
}
