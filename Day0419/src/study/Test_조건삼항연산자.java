package study;
/*
 [����]
 ����ڷκ��� ������ ������ �Է¹޾� �Է¹��� ������ ¦������ Ȧ�������� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 ��, ���ǻ��׿����ڸ� �̿��Ͽ� ó���Ͻÿ�.
 */

import java.util.*;

public class Test_���ǻ��׿����� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a;
		String s;	
		
		System.out.print("������ ������ �Է��Ͻÿ�.\n:");
		a = sc.nextInt();
		
		s = (a%2==0)?"¦��":"Ȧ��";
		System.out.printf("����ڴԲ��� �Է��Ͻ� ���� %d��(��) %s�Դϴ�.", a, s);
				
		}
		
	}
