package study;

import java.util.*;
public class Test003_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("ù��° ������ �Է����ּ���.\n:");
		a = sc.nextInt();
		System.out.print("�ι�° ������ �Է����ּ���.\n:");
		b = sc.nextInt();
		System.out.print("����° ������ �Է����ּ���.\n:");
		c = sc.nextInt();
		
		if(a>b) {
			a = a^b;
			b = b^a;
			a = a^b;
		}
		if(a>c) {
			a = a^c;
			c = c^a;
			a = a^c;
		}
		if(b>c) {
			b = b^c;
			c = c^b;
			b = b^c;
		}
		System.out.printf("%d %d %d", a, b, c);
	}

}
