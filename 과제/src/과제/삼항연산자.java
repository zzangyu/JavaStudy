package ����;

import java.io.IOException;

public class ���׿����� {

	public static void main(String[] args) throws IOException {

		char ch;
		String result;

		System.out.print("���ĺ� �� ���� �Է�: ");
		ch = (char) System.in.read();

		/*
		 * [����] ������ ���ĺ��� �Է¹޾� ������ ������ �����ϴ� ���α׷� ���� �����̸� ����̶�� ���, �����̸� �����̶�� ��� ��, ��ҹ���
		 * ��� �����ϰ�, ���ĺ� �̿��� ���ڰ� �ԷµǸ� �Է� ����
		 */

		result = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				? ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
						? "�ҹ��� ����" : (ch == 'A' || ch == 'E' || ch == 'O' || ch == 'E' || ch == 'U') ?"�빮�ڸ���" : "����")
				: "���ĺ� �ƴ�";

		System.out.printf("%s", result);

	}

}
