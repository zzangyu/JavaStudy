package review_package1;

public class MethodAccessRunnerInsideSamePackage {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
//		exampleClass.privateMethod(); private�� ���� �Ұ���
		exampleClass.protectedMethod();
		exampleClass.publicMethod();
		exampleClass.defaultMethod();

	}

}
