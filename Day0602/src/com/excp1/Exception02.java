package com.excp1;

// 실행 순서
public class Exception02 {

	public static void main(String[] args) throws Exception {

		throw new Exception(); // 예외 전가

		// throw: 예외를 강제로 발생시킴
		// throw new 발생시킬 객체의 생성자

		/*
		 * System.out.println(1); System.out.println(2); try { System.out.println(3);
		 * System.out.println(0 / 0); System.out.println(4); } catch
		 * (ArithmeticException e) { System.out.println(5); } catch (Exception e) {
		 * System.out.println(6); } System.out.println(7);
		 */

	}

}
