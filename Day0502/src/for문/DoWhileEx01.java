package for��;

import java.util.Scanner;

public class DoWhileEx01 {

	public static void main(String[] args) {
		int a = 1 , sum = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("���ڸ� �Է����ּ���~ �� ");
			a = sc.nextInt();
			sum += a;
			System.out.println("���� �Է� �� �������� ���� "+sum+"�Դϴ�.");
	
		} while(a!=0);
			System.out.print("0�� �ԷµǾ� ����˴ϴ�. �Է� �� �������� ���� "+sum+"�Դϴ�.");
		
		

	}

}
