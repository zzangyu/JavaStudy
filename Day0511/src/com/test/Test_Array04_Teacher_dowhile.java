package com.test;

import java.util.Random;
import java.util.Scanner;

public class Test_Array04_Teacher_dowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = { "����", "����", "��" };

		Random rd = new Random();
		int com = rd.nextInt(3) + 1;
		// ����(���� ��)�� �߻���Ų��.
		int user;
		do {
			System.out.println("1: ����, 2: ����, 3: �� �� �Է�");
			user = sc.nextInt();
		} while (user < 1 || user > 3);
		String result;
		result = "���º� ���̿��̿�~!";
		if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2))
			result = "����ڰ� �¸��ϼ̽��ϴ���!";
		if ((user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1))
			result = "����ڴ� ���ٵ���~��!";
		System.out.println("���� �º� ���: " + result);

	}

}
