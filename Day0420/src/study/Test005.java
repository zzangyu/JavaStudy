package study;

/*
[����]
������ ������ ���� �ݾ��� �Է� �޾Ƽ� ��������, ������, õ����, ����� ����, ��� ����, ���ʿ� ����, �ʿ� ����, �Ͽ� ����
�� ��� ��ȯ�Ǵ����� ����ϴ� ���α׷��� �����Ͻÿ�.
�ȳ���Ʈ
�ݾ� �Է�:
�Է� �ݾ�: 65376 
*/
import java.util.Scanner;

public class Test005 {
	
	final static int a = 50000;
	final static int b = 10000;
	final static int c = 1000;
	final static int d = 500;
	final static int e = 100;
	final static int f = 10;
	final static int g = 1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, res, a1, b1, c1, d1, e1, f1, g1;
		
		
		res = 0;
		System.out.print("�ݾ� �Է�");
		i = sc.nextInt();
		
		
		
		if (i > 0) {
			a1 = i / a;
			res = i % a;
			System.out.println("��������" + a1 + "��");
		}
		if (i > 0) {
			b1 = res / b;
			res = res % b;
			System.out.println("������" + b1 + "��");
		}
		if (i > 0) {
			c1 = res / c;
			res = res % c;
			System.out.println("õ����" + c1 + "��");
		}
		if (i > 0) {
			d1 = res / d;
			res = res % d;
			System.out.println("500�� ���� " + d1 + "��");
		}
		if (i > 0) {
			e1 = res / e;
			res = res % e;
			System.out.println("100�� ���� " + e1 + "��");
		}
		if (i > 0) {
			f1 = res / f;
			res = res % f;
			System.out.println("10�� ���� " + f1 + "��");
		}
		if (i > 0) {
			g1 = res / g;
			res = res % g;
			System.out.println("1�� ���� " + g1 + "��");
		}
	}
}
