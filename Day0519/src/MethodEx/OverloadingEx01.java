package MethodEx;

/*
�޼ҵ� �����ε�
- ������(�ϳ���) Ŭ�������� ���� �̸��� ���� �޼ҵ尡 ���� �� ���ǵǴ� ���� �ǹ���
- ���� �̸��� �޼ҵ忡 ����(�Ű�����)�� �ٸ� ���
- ���ڰ� �ٸ��ٴ� ���� ������ ������ �ٸ��ų�, ������ �ڷ����� �ٸ��ų�, ������ ���� �ٸ����� �ǹ��Ѵ�.
- ���� �������� ����� ������ �����ϴ� �޼ҵ���� ��Ƽ� �̸��� ���Ը���� �ϰ����� �����ϱ� �����̴�.

���������� ��ȯ�� �޼ҵ��(�ڷ��� ����, �ڷ��� ����, ...)
	1. ���������ڿ� ��ȯ���� �������.
	2. �޼ҵ��� �̸��� �ݵ�� ���ƾ��Ѵ�.(�����ؾ� �Ѵ�.)!!
	3. �ڷ����̳� ������ ������ �ݵ�� �ٸ��� �ؾ��Ѵ�.
 */

public class OverloadingEx01 {

	public void intLength(int a) {
		String s = String.valueOf(a);
		System.out.println("�Է��� ���� ����: " + s.length());
	}

	public void floatLength(float a) {
		String s = String.valueOf(a);
		System.out.println("�Է��� ���� ����: " + s.length());
	}

	public void stringLength(String a) {
		System.out.println("�Է��� ���� ����: " + a.length());
	}

	public static void main(String[] args) {
		OverloadingEx01 oe1 = new OverloadingEx01();
		oe1.intLength(1000);
		oe1.floatLength(314f);
		oe1.stringLength("10000");
	}

}
