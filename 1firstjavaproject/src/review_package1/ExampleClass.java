package review_package1;

public class ExampleClass {
	public void publicMethod() {
		// ��𼭵� ��� ����
	}

	protected void protectedMethod() {
		// ���� ��Ű���� �ڽ� ��Ű���� �����ϴ� �͸� ������ ����
		// �ٸ� Ŭ������ ����Ѵٸ� ��밡��!
	}

	private void privateMethod() {
		// Ư�� Ŭ���� �ȿ����� ����� ����
	}

	void defaultMethod() {
		// �� Ŭ������ ��Ű�� �ȿ����� ��� ����
	}

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		// ���� Ŭ���� ������ �� ���� ���� !
		exampleClass.privateMethod();
		exampleClass.protectedMethod();
		exampleClass.publicMethod();
		exampleClass.defaultMethod();

	}

}
