package Q;

import java.util.Scanner;

public class Sunglmpl extends Record implements Sung {
	Scanner sc = new Scanner(System.in);
	int inwon;
	Record[] re;

	@Override
	public void set() {
		do {
			System.out.print("학생 수를 입력해주세요(최대 5명) - ");
			inwon = sc.nextInt();
			re = new Record[inwon];
		} while (inwon > 6 || inwon < 1);
	}

	@Override
	public void input() {
		sum = 0;
		for (int i = 0; i < inwon; i++) {
			re[i] = new Record();
			System.out.printf("%d번째 학생의 학번과 이름을 입력해주세요(공백 구분) - ", (i + 1));
			re[i].number = sc.nextInt();
			re[i].name = sc.next();
			System.out.printf("국어 영어 수학순으로 점수를 입력해주세요(공백 구분) - ");
			for (int j = 0; j < sco.length; j++) {
				re[i].sco[j] = sc.nextInt();
				re[i].sum += re[i].sco[j];
			}
			re[i].avg = re[i].sum / 3f;
		}

		for (int i = 0; i < re.length; i++) {
			for (int j = 0; j < sco.length; j++) {
				switch (re[i].sco[j] / 10) {
				case 10:
				case 9:
					re[i].scor[j] = "수";
					break;
				case 8:
					re[i].scor[j] = "우";
					break;
				case 7:
					re[i].scor[j] = "미";
					break;
				case 6:
					re[i].scor[j] = "양";
					break;
				default:
					re[i].scor[j] = "가";
					break;
				}
			}
		}
	}

	@Override
	public void print() {
		for (int i = 0; i < inwon; i++) {
			System.out.printf("%d", re[i].number);
			System.out.printf("%4s", re[i].name);
			for (int j = 0; j < sco.length; j++) {
				System.out.printf("%4d", re[i].sco[j]);
			}
			System.out.printf("%5d", re[i].sum);
			System.out.printf("%6.2f", re[i].avg);
			for (int k = 0; k < scor.length; k++) {
				System.out.printf("%2s", re[i].scor[k]);
			}
			System.out.println();
		}
	}

}
