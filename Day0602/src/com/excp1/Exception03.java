package com.excp1;

public class Exception03 {
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4);
		} catch (NullPointerException e) { // ��� �ش� �ȵǴϱ� ������
			if (e instanceof NullPointerException) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			System.out.println("NullPointerException");
		} catch (ArithmeticException e) {
			if (e instanceof ArithmeticException) { // ��ü���� Ȯ�� �� ��
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception . . .");
		} finally {
			// ������ ����
			System.out.println(5);
		}
		System.out.println(6);

	}
}
