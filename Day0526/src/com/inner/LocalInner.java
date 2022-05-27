package com.inner;

/*
 * LocalInner class
 * - Ŭ���� ���ο� Ư�� �޼ҵ� �ȿ� ���ǵǴ� Ŭ������.
 * - ���������� ���� ���̴�.
 * - �޼ҵ尡 ȣ��� �� ������ �� ������ �޼ҵ��� ������� �������� ������ ���������� ���� �ڵ����� �Ҹ�ȴ�.
 *
 * ���� ��������� �ʴ´�.��
 *		- �޼ҵ� ���ο� Ŭ������ ���� �޼ҵ� ����ÿ��� ����ȴ�.
 *
 * 		class Outer{
 *
 * 			public void aa(){ // Ŭ������ ��� Method
 * 				class Inner{ // method �ȿ��� ���������� ���� ���� ��ġ
 *
 * 				}
 * 			}
 * 		}
 *
 *
 *
 */
public class LocalInner {

	int a = 100; // �ܺ� Ŭ������ ��� ����

	public void innerExam01(int k) { // member method

		int b = 200; // ���� ����(method �������� ������)
		final int c = k; // ���

		class Inner { // Local Inner Class
			// Local Inner Class�� �ܺ� Ŭ������ ��� ������ ���� ��ġ�� ������
			// ��� ������ ����鸸 ������ �����ϴ�.

			public void getData() {
				System.out.println("int a: " + a);
				System.out.println("int b: " + b);
				System.out.println("final int c: " + c);

			}

		}
		// �޼ҵ� ������ ���� �̳� Ŭ������ ��ü ������ �����ϴ�.
		Inner i = new Inner();
		i.getData();
	}// end inner class

	public static void main(String[] args) {
		LocalInner li = new LocalInner();
		li.innerExam01(1000);

	}

}
