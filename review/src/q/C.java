package q;

public class C {
	int o;

	protected void g() { // ����ϸ� ����! �ٸ� package�� �Ұ��� !
		B b = new B(); // ���� package������ ��� !
//		b.n = 22; // private�� ���� �Ұ���
//		b.g();
		o = 3;
	}
}
