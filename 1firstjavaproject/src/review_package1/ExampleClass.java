package review_package1;

public class ExampleClass {
	public void publicMethod() {
		// 어디서든 사용 가능
	}

	protected void protectedMethod() {
		// 같은 패키지나 자식 패키지에 존재하는 것만 접근이 가능
		// 다른 클래스가 상속한다면 사용가능!
	}

	private void privateMethod() {
		// 특정 클래스 안에서만 사용이 가능
	}

	void defaultMethod() {
		// 그 클래스와 패키지 안에서만 사용 가능
	}

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		// 같은 클래스 내에선 다 접근 가능 !
		exampleClass.privateMethod();
		exampleClass.protectedMethod();
		exampleClass.publicMethod();
		exampleClass.defaultMethod();

	}

}
