package com.excp1;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		String[] stringNumber = { "23", "12", "3.141592", "998" };

		int i = 0;

		for (; i < stringNumber.length; i++) {
			try {
				int n = Integer.parseInt(stringNumber[i]);
				System.out.println("������ ��ȯ�� ��: " + n);
			} catch (NumberFormatException e) {
				System.out.println(stringNumber[i] + "�� ������ ��Ȱ�� �� �����ϴ�.");
			}
		}

	}

}
