package study;
/*
 ������ �� ������ �����ڸ� �Է¹޾� ������� ���α׷��� �����Ͻÿ�.
 �� ��������ڴ� (+, -, *, /, %)
 	��� �Է��� bufferedReader�� ó���Ͻÿ�.
 */
import java.io.*;

public class Test_BufferedReader {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int num1, num2, op;
		
		System.out.print("ù��° ����: ");
		num1= Integer.parseInt(br.readLine());
		System.out.print("������ �Է�:");
		op = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.print("�ι�° ����: ");
		num2= Integer.parseInt(br.readLine());
		
		System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1+num2));

		
		
		
		
		
	}

}
