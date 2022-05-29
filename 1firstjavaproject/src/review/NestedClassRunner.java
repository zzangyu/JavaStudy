package review;

class DefaultClass { // default class - ���� pakage �ȿ����� ��� ����

}

public class NestedClassRunner {
	// class �ȿ� �ִ� class - Nested class
	// 1. Inner Class (non-static nested class)
	// 2. Static Nested Class

	int i;

	class InnerClass {
		// NestedClassRunner�� �ν��Ͻ��� ������ ��� x
		void method() {
			i = 5;
		}
	}

	static class StaticNestedClass { // static method, static variable�� ��� ����
		// NestedClassRunner�� �ν��Ͻ��� ��� ��� o

		void method() {
//			i = 5; // static variable�� ��� ����
		}
	}

	public static void main(String[] args) {
		StaticNestedClass staticnestedclass = new StaticNestedClass();

		NestedClassRunner nestedclassrunner = new NestedClassRunner();
		InnerClass innerclasss = nestedclassrunner.new InnerClass();
//		NestedClassRunner.InnerClass innerclass = new NestedClassRunner().new InnerClass();
	}

}
