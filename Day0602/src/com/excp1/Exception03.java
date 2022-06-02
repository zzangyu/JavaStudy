package com.excp1;

public class Exception03 {
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4);
		} catch (NullPointerException e) { // 얘는 해당 안되니까 지나감
			if (e instanceof NullPointerException) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			System.out.println("NullPointerException");
		} catch (ArithmeticException e) {
			if (e instanceof ArithmeticException) { // 객체인지 확인 할 때
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception . . .");
		} finally {
			// 무조건 실행
			System.out.println(5);
		}
		System.out.println(6);

	}
}
