package study;

// ���� �ϳ��� ������ ���

import java.io.IOException;
public class InputEx02_InputASCIICode {

	public static void main(String[] args) throws IOException{
		
		System.out.print("���� �ϳ� �Է�: ");
		char ch = (char)System.in.read(); // (char) ���ڷ� ��������ȯ
		System.out.println("���ڹ��� ����: "+ch); // hhhh������ h �ϳ��� ���´�.
		
	}

}
