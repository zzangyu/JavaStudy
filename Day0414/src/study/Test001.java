package study;

/*
 * �� ��ȯ
 * 		������ ����ȯ(�ڵ�����ȯ)
 * 			�� ū �ڷ������� ��ȯ(�ڵ�)
 * 			���� �ս��� ����.
 * 			ex) short a, b;
 * 				  a = b = 10;
 * 				  int c = a + b; (ū�ſ� ���°� ����� ���� �� short�� int�� ���� ��)
 * 
 * 		����� ����ȯ(��������ȯ)
 * 			�� ���� �ڷ������� ��ȯ(���)
 * 			������ �ս� ���ɼ��� �ִ�.
 * 			ex) int c = 0;
 * 				  short s = 10;
 * 				  s = c + s; �� ������ ����
 * 				  s =(short)(c + s); �� �䷸�� �ϸ� �ȴ�. ������ ������ �ս��� �ִ�.. �׸��� ������ �� �Ǵ°� �ƴϴ�.
 *			boolean���� �� ��ȯ�� �ȵȴ�.
 * 			byte : char�� casting�̴�.
 * 			long : float�� �ڵ����� �Ǽ��� ó���ȴ�. �Ǽ����� ���������� ũ�Ƿ�.
 * 
 * 			�⺻�ڷ��� -> classȭ wrapper
 * 			byte -> Byte
 * 			short -> Short
 * 			int -> Integer
 * 			long -> Long
 * 			char -> Character 
 * 
 */

public class Test001 {

	public static void main(String[] args) {

		// ����ȯ�̶� ���� �Ǵ� ��� Ÿ���� �ٸ� Ÿ������ ��ȯ�ϰ��� �� ��
		// ��ȯ ��� �� (�ڷ���)(������)
		double d = 97.64;
		int score = (int)d;
		System.out.println(d);
		
		int i = 10;
		byte b = (byte)i;
		System.out.println(i);
		
		i = 500;
		b = (byte)i;
		System.out.println(b);
		
		byte z = 1;
		char x = (char)z;
		System.out.println(z);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
