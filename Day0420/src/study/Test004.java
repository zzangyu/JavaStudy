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

public class Test004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int a, a1 ,b , b1, c, c1 ,d , d1, e, e1, f, f1, g, g1, h, h1;
		
		System.out.print("�ݾ� �Է�");
		i = sc.nextInt();
		
		a=i/50000;
		a1=i%50000;
		
		b=a1/10000;
		b1=a1%10000;
		
		c=b1/1000;
		c1=b1%1000;
		
		d=c1/100;
		d1=c1%100;
		
		
		e=d1/50;
		e1=d1%50;
		
		f=e1/10;
		f1=e1%10;
		
		g=f1/1;
		g1=f1%1;
		
		System.out.printf("%d�� �Ʒ��� ����\n", i);
		System.out.println("��������"+a+"��");
		System.out.println("������"+b+"��");
		System.out.println("õ����"+c+"��");
		System.out.println("��� ����"+d+"��");
		System.out.println("���ʿ� ����"+e+"��");
		System.out.println("�ʿ� ����"+f+"��");
		System.out.println("�Ͽ� ����"+g+"��");
		
		
		
	}

}
