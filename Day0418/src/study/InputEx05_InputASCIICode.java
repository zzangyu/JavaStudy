package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class InputEx05_InputASCIICode {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor, eng, math;
		
		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(br.readLine()); // 문자열(br.readLine)을 정수형으로 바꾼것이다.
		
		System.out.print("영어 점수 : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("수학 점수 : ");
		math = Integer.parseInt(br.readLine());
		
		
	}

}
