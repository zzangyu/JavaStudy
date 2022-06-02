package com.excp1;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		String[] stringNumber = { "23", "12", "3.141592", "998" };

		int i = 0;

		for (; i < stringNumber.length; i++) {
			try {
				int n = Integer.parseInt(stringNumber[i]);
				System.out.println("정수로 변환된 값: " + n);
			} catch (NumberFormatException e) {
				System.out.println(stringNumber[i] + "는 정수로 변활할 수 없습니다.");
			}
		}

	}

}
