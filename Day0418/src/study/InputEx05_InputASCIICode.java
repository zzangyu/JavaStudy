package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class InputEx05_InputASCIICode {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor, eng, math;
		
		System.out.print("���� ���� : ");
		kor = Integer.parseInt(br.readLine()); // ���ڿ�(br.readLine)�� ���������� �ٲ۰��̴�.
		
		System.out.print("���� ���� : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("���� ���� : ");
		math = Integer.parseInt(br.readLine());
		
		
	}

}
