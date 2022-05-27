package review_package2;

import review_package1.ExampleClass;

public class MethodAccessRunnerInDifferentPackage {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
//		exampleClass.privateMethod();
//		exampleClass.protectedMethod();
		exampleClass.publicMethod(); // 다른 패키지에서는 클래스에서 public 메소드만 접근 가능
//		exampleClass.defaultMethod();

	}

}
