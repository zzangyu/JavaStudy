package ����;

/*
[����]
������ ���ĺ��� �Է¹޾� ������ ������ �����ϴ� ���α׷� ����
�����̸� ����̶�� ���, �����̸� �����̶�� ���
��, ��ҹ��� ��� �����ϰ�, ���ĺ� �̿��� ���ڰ� �ԷµǸ� �Է� ����
 */

import java.io.*;

public class ���� {

	public static void main(String[] args) throws IOException {

		char ch;
// str= ���ĺ�?(�ҹ���?�ҹ���:(�빮��?�빮��:����)):���ĺ���
		
		
		System.out.print("���ĺ� �� ���� �Է�: ");
		ch = (char) System.in.read();

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {// ���ĺ����� �ƴ���
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				System.out.print("����");
			else if (ch == 'A' || ch == 'E' || ch == 'O' || ch == 'E' || ch == 'U')
				System.out.print("�빮�� ����");
			else
				System.out.print("����");
		}
		else {
			System.out.print("���� �Է� ����");
		}

	}
}
