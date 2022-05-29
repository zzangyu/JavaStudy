package review;

class DefaultClass { // default class - 같은 pakage 안에서만 사용 가능

}

public class NestedClassRunner {
	// class 안에 있는 class - Nested class
	// 1. Inner Class (non-static nested class)
	// 2. Static Nested Class

	int i;

	class InnerClass {
		// NestedClassRunner의 인스턴스가 없으면 사용 x
		void method() {
			i = 5;
		}
	}

	static class StaticNestedClass { // static method, static variable만 사용 가능
		// NestedClassRunner의 인스턴스가 없어도 사용 o

		void method() {
//			i = 5; // static variable만 사용 가능
		}
	}

	public static void main(String[] args) {
		StaticNestedClass staticnestedclass = new StaticNestedClass();

		NestedClassRunner nestedclassrunner = new NestedClassRunner();
		InnerClass innerclasss = nestedclassrunner.new InnerClass();
//		NestedClassRunner.InnerClass innerclass = new NestedClassRunner().new InnerClass();
	}

}
