package study;
/*
 [����]
 ����ڷκ��� ������ ������ �Է¹޾Ƽ� �Է¹��� ������ �������, ��������, 0������ �����ϴ� ���α׷� ����
 ��, �Է��� bufferedReader / if or ���׿����� Ȱ��
 */

import java.io.*;

public class Test_bufferedReader {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int a;
		
		System.out.print("������ �Է��Ͻÿ�.");
		a = Integer.parseInt(br.readLine());
		
		String s ="";
		/*
		if(a>0) {
			s = "���";
		}else if(a<0) {
			s = "����";
		}else if(a==0) {
			s = "0";
		}
		System.out.print("�Է��� a�� [%s]�Դϴ�."+s);
		*/
		
		s = (a< 0)?"����":((a==0)?"0":"���");
		
		
		
	}

}
