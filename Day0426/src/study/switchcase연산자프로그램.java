package study;
/*
[����]
��Ģ ������ �Է¹޾� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�����ڴ� +,-,*,/ �װ����� ��� ó���Ѵ�.
�ǿ����ڿ� �����ڴ� ��ĭ���� �и��Ͽ� �Է�
0���� ������ �� "0���� ���� �� �����ϴ�." �� ����ϰ� �����Ѵ�.
scanner�� ����Ͽ� ���ڿ��� �Է¹����ÿ�.
 */
import java.util.*;
public class switchcase���������α׷� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, result;
		String c;
		result = 0;
		
		System.out.println("ù��° ���� �Է�");
		a = sc.nextInt();
		System.out.println("������ �Է�");
		c= sc.next();
		System.out.println("�ι�° ���� �Է�");
		b = sc.nextInt();
		
		switch (c) {
		case "+":
			result = (a+b);
			break;
		case "-":
			result = (a-b);			
			break;
		case "/":
			if(b==0) {
				System.out.println("��� �Ұ���");
				return;
			}
			result = (a/b);			
			break;
		case "*":
			result = (a*b);
			break;
		default :
			System.out.println("��Ģ ������ �ƴմϴ�.");
		}
		System.out.printf("%d %s %d =%d", a, c, b, result);
	}

}
