package TEST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
����]
�迭�� �̿��Ͽ� �Ѹ��� �л��� ���� ����ó�� ���α׷��� �ۼ��Ѵ�.
���� �� , ���� ��
�̸��� �Է�
�̸�, �����, ����, ���, ����
 */
public class test05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�̸� ! ");
		String name = br.readLine();
		System.out.print("���� � ! ");
		int sr = Integer.parseInt(br.readLine());

		String[] subject = new String[sr];
		int score[] = new int[subject.length + 1];

		for (int i = 0; i < subject.length; i++) {
			System.out.print("���� �Է� - ");
			subject[i] = br.readLine();
		}
		if (subject.length == 0) {
			System.out.println("������� �����ϴ�.");
			System.exit(0);
		}
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "���� �Է� - ");
			score[i] = Integer.parseInt(br.readLine());
			score[score.length - 1] += score[i];
		}

		System.out.println("<<" + name + "���� ����ǥ>>");
		for (int i = 0; i < sr; i++) {
			System.out.println(subject[i] + " : " + score[i] + "��");
		}
		System.out.println("���� : " + score[score.length - 1] + "��");
		System.out.println("��� : " + (double) (score[score.length - 1] / subject.length) + "��");
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
		System.out.println("���� : " + grade);

	}

}
