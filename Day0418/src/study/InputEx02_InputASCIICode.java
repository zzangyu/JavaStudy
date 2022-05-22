package study;

// 문자 하나만 나오는 방법

import java.io.IOException;
public class InputEx02_InputASCIICode {

	public static void main(String[] args) throws IOException{
		
		System.out.print("문자 하나 입력: ");
		char ch = (char)System.in.read(); // (char) 문자로 강제형변환
		System.out.println("문자받은 문자: "+ch); // hhhh넣으면 h 하나만 나온다.
		
	}

}
