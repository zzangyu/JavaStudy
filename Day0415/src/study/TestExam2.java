package study;

import java.util.Scanner;

public class TestExam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int math, eg, kr ,total=0;
		double avg = 0;
		System.out.print("���� ������ �Ʒ��� �Է��Ͻÿ�.");
		math = Integer.parseInt(sc.next());
		System.out.print("���� ������ �Ʒ��� �Է��Ͻÿ�.");
		eg = Integer.parseInt(sc.next());
		System.out.print("���� ������ �Ʒ��� �Է��Ͻÿ�.");
		kr = Integer.parseInt(sc.next());
		
		total = math + eg + kr;
		avg = total/3.0f; // �Ҽ��� �Ʒ��ڸ����� Ȯ���ϰ� �������� ���� ������. /3�ص� �ȴ�.
		
		System.out.printf("��� ������ %.2f���̰� ������ %d���̴�.", avg, total);
		
		sc.close();

	}

}
