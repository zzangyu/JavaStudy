package ExceptionHandling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		method01();
		System.out.println("main ended");
	}

	private static void method01() {
		method02();
		System.out.println("method01 ended");
	}

	private static void method02() {
		String str = null;
		str.length();
		System.out.println("method02 ended");
	}

}
