package p;

import q.B; // B class�� �ٸ� package�̱� ������ import �ʼ� !
import q.C;

class A {

	void f() {
		B b = new B();
//		b.n = 3; // private�� ���� �Ұ���
//		b.g();
		C c = new C();

	}
}
