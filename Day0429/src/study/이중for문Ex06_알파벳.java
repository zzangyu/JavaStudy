package study;

/*
[����]
Scanner�� �̿��Ͽ� �ҹ��� ���ĺ��� �ϳ� �Է� �ް�
������ ���� Ǯ���ϴ� ���α׷��� �ۼ��Ͻÿ�
���ĺ� �Է� : e
abcde
abcd
abc
ab
a
 */
import java.util.Scanner;
public class ����for��Ex06_���ĺ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		
		System.out.print("���ĺ��� �Է� ���ּ���.");
		c = sc.next().charAt(0);
		
		for(char i = c; i>='a'; i--) {
		for(char j = 'a'; j<=i; j++) {
			
			
			System.out.print(j);
			}
			System.out.println();
		}
		
		

	}

}
