package ExceptionHandling;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {
		method01();
		System.out.println("main ended");
	}

	private static void method01() {
		method02();
		System.out.println("method01 ended");
	}

	private static void method02() {
		try {
//			String str = null;
//			str.length();
			int[] i = { 1, 2 };
			int number = i[3]; // ?????? NullPointException?? ?ƴ϶? ?ؿ????? ?ɷ???
			System.out.println("?? ?̰? ?Ⱥ???~");
		} catch (NullPointerException ex) {
			System.out.println("Matched NullPointerException");
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Matched ArrayIndexOutOfBoundsException");
			ex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Matched Exception");
			ex.printStackTrace();
		}
		System.out.println("method02 ended");
	}

}
