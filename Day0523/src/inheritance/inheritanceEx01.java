package inheritance;

class Base {
	public Base() {
		System.out.println("�θ��.");
	}
}

class Derived extends Base {
	public Derived() {
		super(); // �ڵ��� ���� �θ� Ŭ������ �⺻ ������(�Ű������� ���� ������)�� �ݵ�� ���ǵǾ� �־�� �Ѵ�.
		System.out.println("�ڽ��̴�.");
	}

	public void aa() {
		System.out.println("������");
	}
}

public class inheritanceEx01 {

	public static void main(String[] args) {
		Derived a = new Derived();
		Base b = new Derived(); // ���� ����ȯ, upcasting
	}

}
