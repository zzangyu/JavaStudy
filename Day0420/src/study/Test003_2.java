package study;
/*
[����]
����ڷκ��� ������ ���� ������ �Է¹޾� ���������� ū�� ������ ����ϴ� ���α׷��� �ۼ��Ѵ�.
 */
import java.util.*;

public class Test003_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, temp=0;
		
		System.out.print("ù��° ������ �Է����ּ���.\n:");
		a = sc.nextInt();
		System.out.print("�ι�° ������ �Է����ּ���.\n:");
		b = sc.nextInt();
		System.out.print("����° ������ �Է����ּ���.\n:");
		c = sc.nextInt();
		
		if(a>b) {
			temp = a ;
			a = b;
			b = temp;  
		}
		if(b>c) {
			temp = b;
			b = c; 
			c = temp;
		}
		if(a>c) {
			temp = a;
			a = c;
			c = temp;
		}
		System.out.printf("%d %d %d", a, b, c);
		
	}
		
}
