package study;

/*
���ڿ� �Է� �޴� ��
InputString�� ��������� �ȴ�. String�� ��� - �̰� �ƴҼ������� ����;
BufferedReader - ���͸� ġ�� ������ �ӽñ������� ����Ǵ� ���̴�.  ����ġ�� �ý��� ������ ���´�.
 */

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
import java.io.*; // ���� ���� �����ϴ� �ڵ�, ���� ���� �� ������ �̰� ������
public class InputEx04_InputASCIICode {

	public static void main(String[] args) throws IOException{
	
		String name , age, addr, tel;
		
		//InputStreamReader is = new InputStreamReader(System.in));
		//BufferedReader bb = new BufferedReader(is); �� �ڵ�� �����ǵ� �и��س������̴�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�̸�: ");
		name = br.readLine(); //���͸� ġ���� Line ���ڸ� 
		
		System.out.print("����: ");
		age = br.readLine();
		
		System.out.print("�ּ�: ");
		addr = br.readLine();
		
		System.out.print("��ȭ��ȣ: ");
		tel = br.readLine();
		
		
	}

}
