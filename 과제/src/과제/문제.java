package 과제;

/*
[문제]
임의의 알파벳을 입력받아 자음과 모음을 판정하는 프로그램 구현
자음이면 장므이라고 출력, 모음이면 모음이라고 출력
단, 대소문자 모두 적용하고, 알파벳 이외의 문자가 입력되면 입력 오류
 */

import java.io.*;

public class 문제 {

	public static void main(String[] args) throws IOException {

		char ch;
// str= 알파벳?(소문자?소문자:(대문자?대문자:자음)):알파벳ㄴ
		
		
		System.out.print("알파벳 한 문자 입력: ");
		ch = (char) System.in.read();

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {// 알파벳인지 아닌지
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				System.out.print("모음");
			else if (ch == 'A' || ch == 'E' || ch == 'O' || ch == 'E' || ch == 'U')
				System.out.print("대문자 모음");
			else
				System.out.print("자음");
		}
		else {
			System.out.print("문자 입력 오류");
		}

	}
}
