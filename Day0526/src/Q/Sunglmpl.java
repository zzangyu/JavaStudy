package Q;

import java.util.Scanner;

public class Sunglmpl extends Record implements Sung {
	Scanner sc = new Scanner(System.in);
	int inwon;
	Record[] aa;

	@Override
	public void set() {
		System.out.print("학생 수를 입력해주세요 - ");
		inwon = sc.nextInt();
		aa = new Record[inwon];
	}

	@Override
	public void input() {
		sum = 0;
		for (int i = 0; i < inwon; i++) {
			aa[i] = new Record();
			System.out.print("학번과 이름을 입력해주세요 - ");
			aa[i].number = sc.nextInt();
			aa[i].name = sc.next();
			System.out.print("국어, 영어, 수학 점수를 입력해주세요 - ");
			for (int j = 0; j < sco.length; j++) {
				aa[i].sco[j] = sc.nextInt();
				aa[i].sum += aa[i].sco[j];
			}
			aa[i].avg = aa[i].sum / 3f;
		}

		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < sco.length; j++) {
				switch (aa[i].sco[j] / 10) {
				case 10:
				case 9:
					aa[i].scor[j] = "수";
					break;
				case 8:
					aa[i].scor[j] = "우";
					break;
				case 7:
					aa[i].scor[j] = "미";
					break;
				case 6:
					aa[i].scor[j] = "양";
					break;
				default:
					aa[i].scor[j] = "가";
					break;
				}
			}
		}
	}

	@Override
	public void print() {
		for (int i = 0; i < inwon; i++) {
			System.out.printf("%d", aa[i].number);
			System.out.printf("%4s", aa[i].name);
			for (int j = 0; j < sco.length; j++) {
				System.out.printf("%4d점", aa[i].sco[j]);
			}
			System.out.printf("%5d점", aa[i].sum);
			System.out.printf("%6.2f점", aa[i].avg);
			for (int k = 0; k < scor.length; k++) {
				System.out.printf("%2s", aa[i].scor[k]);
			}
			System.out.println();
		}
	}

}
