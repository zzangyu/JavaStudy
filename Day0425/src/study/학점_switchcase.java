package study;

import java.io.*;

// ����� �Ҽ���
public class ����_switchcase {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int S, math, kor, eng, his, sci;
		int total;
		float avrg;
		char grade;

		System.out.println("���� ������ �Է� ���ּ���.");
		math = Integer.parseInt(br.readLine());
		System.out.println("���� ������ �Է� ���ּ���.");
		eng = Integer.parseInt(br.readLine());
		System.out.println("���� ������ �Է� ���ּ���.");
		kor = Integer.parseInt(br.readLine());
		System.out.println("���� ������ �Է� ���ּ���.");
		his = Integer.parseInt(br.readLine());
		System.out.println("���� ������ �Է� ���ּ���.");
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
		System.out.print("������ "+total+"��, "+"����� "+avrg+", ");
		System.out.println("������ "+grade+"�Դϴ�.");
	}
}
