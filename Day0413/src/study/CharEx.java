package study;

import java.util.Scanner; //ctrl shift o

/*
 *  char: 2byte
 *  	�ƽ�Ű �ڵ�: 1����Ʈ ���ڸ� ǥ��, 0~255 ���� ����
 *  	���� �ڵ�: 2����Ʈ�� ǥ��, 0~65535 ���� ���� 
 * 		https://www.unicode.org/charts/PDF/UFF00.pdf ���� �ڵ� ǥ, �ڹ� å p60 ����
 * 
 * 
 * 	int+short�� short�� ���� �� 2byte�� ������ �ִ´�. �� ��������ȯ, ���������ȯ. ��ġ�� �����ߵȴ�!
 * 
 * 
 */

public class CharEx {

	public static void main(String[] args) {
		//�̱����� ��� '' 
		
		Scanner sc = new Scanner(System.in);
		
		char ch1 = 'A';
		char ch2 = '\u0041'; //���� ������ ���ߵǴµ� �Ἥ �ȳ��°���. ��������u�� ���(�����ڵ�) 
		
		System.out.println((int)(ch1));
		System.out.println((int)(ch2));
		System.out.println(ch1+ch2);
		System.out.println((char)(ch1+ch2));
		
		System.out.println("���� �Է�");
		String str = sc.next();
		System.out.println(str);
		
		
		
		
		
		
	}

}
