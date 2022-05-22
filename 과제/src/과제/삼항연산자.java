package 과제;

import java.io.IOException;

public class 삼항연산자 {

	public static void main(String[] args) throws IOException {

		char ch;
		String result;

		System.out.print("알파벳 한 문자 입력: ");
		ch = (char) System.in.read();

		/*
		 * [문제] 임의의 알파벳을 입력받아 자음과 모음을 판정하는 프로그램 구현 자음이면 장므이라고 출력, 모음이면 모음이라고 출력 단, 대소문자
		 * 모두 적용하고, 알파벳 이외의 문자가 입력되면 입력 오류
		 */

		result = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				? ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
						? "소문자 모음" : (ch == 'A' || ch == 'E' || ch == 'O' || ch == 'E' || ch == 'U') ?"대문자모음" : "자음")
				: "알파벳 아님";

		System.out.printf("%s", result);

	}

}
