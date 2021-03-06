package MethodEx;

public class OverloadingEx02 {
	// 접근제한자는 상관 없다 !
	public void getLength(int n) {
		String s = String.valueOf(n);
		getLength(s);
	}

	void getLength(int n1, int n2) {
		String s1 = String.valueOf(n1);
		String s2 = String.valueOf(n2);
		getLength(s1);
		getLength(s2);
	}

	private void getLength(int n1, int n2, int n3) {
		String s1 = String.valueOf(n1);
		String s2 = String.valueOf(n2);
		String s3 = String.valueOf(n3);
		getLength(s1);
		getLength(s2);
		getLength(s3);
	}

	private void getLength(float n) {
		String s = String.valueOf(n);
		getLength(s);
	}

	private void getLength(String s) {
		System.out.print("입력한 값의 길이: " + s.length());
	}

	public static void main(String[] args) {
		OverloadingEx02 oe2 = new OverloadingEx02();
		oe2.getLength(1000);
		System.out.println();

		oe2.getLength(314f);
		System.out.println();

		oe2.getLength(23, 22);
		System.out.println();

		oe2.getLength(23, 22, 66);
		System.out.println();

		oe2.getLength("아뭐라는거야");

	}

}
