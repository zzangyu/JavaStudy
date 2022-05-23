package inheritance;

class Parent {
	void print() {
		System.out.println("Parent �޼ҵ� ȣ��");
	}
}

class Child extends Parent {
	@Override
	void print() {
		System.out.println("Child �޼ҵ� ȣ��");
	}
}

public class Casting {

	public static void main(String[] args) {
		Parent p = new Child(); // ��ĳ����: �ڽ� ��ü�� �θ� ��ü�� ����ȯ
		p.print(); // ���� �޼ҵ� ȣ��, �ڽ��� print() ȣ��
		Parent pa = new Parent();
		pa.print();

		// Child c = new Parent -> ������ ����

		Child c = (Child) p; // �ٿ�ĳ����: �θ� ��ü�� �ڽ� ��ü�� ����ȯ
		// Child ch = p; p�տ� (Child)�� �ٿ��� (Child)p�� �Ǿ �Ѵ�.
		c.print(); // �޼ҵ� �������̵�, �ڽ� ��ü�� print() ȣ��
	}

}
