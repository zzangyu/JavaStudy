package study;


import java.util.*;

public class IfEx03_��ĳ�ʴ���if��Ʈ��equalsȰ�� {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		char c;
		String s;
		
		System.out.print("ù��° �Է� ��: ");
		a = sc.nextInt();
		
		System.out.print("������ �Է�: ");
		s=sc.next();
		
		
		System.out.print("�ι�° �Է� ��: ");
		b = sc.nextInt();		
		
		if(s.equals("+")){
			System.out.printf("%d %s %d = %d\n", a, s, b, (a+b));
		
		}else if (s.equals("-")){
			System.out.printf("%d %c %d = %d\n", a, s, b, (a-b));
		
		}else if (s.equals("*")) {
			System.out.printf("%d %c %d = %d\n", a, s, b, (a*b));
			
		}else if (s.equals("/")) {
			System.out.printf("%d %c %d = %d\n", a, s, b, (a/b));
			
		}else if (s.equals("%")) {
			System.out.printf("%d %c %d = %d\n", a, s, b, (a%b));
			
		}else System.out.print("�����ڰ� �ƴմϴ�.");		
		
	}

}