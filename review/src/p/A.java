package p;

import q.B; // B class는 다른 package이기 때문에 import 필수 !
import q.C;

class A {

	void f() {
		B b = new B();
//		b.n = 3; // private라 접근 불가능
//		b.g();
		C c = new C();

	}
}
