package study;

import java.util.*;

public class IfEx02_�ܼ�if {

	public static void main(String[] args) {
	
		// �Է¹��� ���� ¦�� ?
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��Ͻÿ�: ");
		a=sc.nextInt();
		
		if(a%2==0) 
			System.out.print("¦�� �Դϴ�.");
			System.out.println("Ȧ�� �Դϴ�."); // ¦���� �ƴϸ� �� ����Ʈ�� ���x �� �ܼ�if���� ��� �ϳ��� �ν��ϴϱ� �ι�° �ڵ幮�� ��� �Ȱ��̴�.
	}

}
