package study;


/*
������ ������ �Է� �޾� �Է¹��� ���� ¦������ �����Ͻÿ�.
 */

import java.util.*;

public class IfEx01_��ĳ�ʴ���ifȰ�� {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		char c;
		
		System.out.print("ù��° �Է� ��: ");
		a = sc.nextInt();
		
		System.out.print("������ �Է�: ");
		c = sc.next().charAt(0); // sc.next()������ ���ڿ�. ù��° �ε����� �������� �ϴ� ���̴�. �� ���� ù��° �ڸ��� ����������.
		
		System.out.print("�ι�° �Է� ��: ");
		b = sc.nextInt();		
		
		if(c == '+'){
			System.out.printf("%d %c %d = %d\n", a, c, b, (a+b));
		
		}else if (c == '-'){
			System.out.printf("%d %c %d = %d\n", a, c, b, (a-b));
		
		}else if (c == '*') {
			System.out.printf("%d %c %d = %d\n", a, c, b, (a*b));
			
		}else if (c == '/') {
			System.out.printf("%d %c %d = %d\n", a, c, b, (a/b));
			
		}else if (c == '%') {
			System.out.printf("%d %c %d = %d\n", a, c, b, (a%b));
			
		}else System.out.print("�����ڰ� �ƴմϴ�.");		
		
	}

}