package inherEx;

/*
������
- �� Ÿ���� ���������� ���� Ÿ���� ��ü�� ���� �� �� �ֵ��� �ϴ� ���� �ǹ���
- �θ�Ŭ������ Ÿ���� ���������� �ڽ� Ŭ������ �ν��Ͻ��� ���� �� �� �ֵ��� ��
- �θ� Ŭ���� = �ڽ�

������ ����� ����
Super super = new Super();
Sub sub = new Sub();

�������� ����� ����
Super super = new Sub();
Super s1 = new Police();
Super s2 = new Boss();
Super s3 = new Fire();

���������� �޼ҵ�� �ڽİ���, ��������� �θ���� ����Ѵ�.
 */

class ParentEx {

	int foo = 5;

	public int getNumber(int a) {
		return a + 1;
	}

}

public class SonEx extends ParentEx {

	int foo = 7; // �ڽ��� �������

	@Override
	public int getNumber(int a) { // �ڽ��� �޼ҵ�

		return a + 2;
	}

	public static void main(String[] args) {
		ParentEx pe = new SonEx();
		System.out.println(pe.getNumber(0)); // 2: �޼ҵ� �ڽ�
		System.out.println(pe.foo); // 5: ��������� �θ�

		SonEx se = new SonEx();
		System.out.println(se.foo);

	}

}
