package review_package2;

import review_package1.ExampleClass;

public class MethodAccessRunnerInDifferentPackage {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
//		exampleClass.privateMethod();
//		exampleClass.protectedMethod();
		exampleClass.publicMethod(); // �ٸ� ��Ű�������� Ŭ�������� public �޼ҵ常 ���� ����
//		exampleClass.defaultMethod();

	}

}
