package study;

/*
[����]
������ �г��� �Է¹޾Ƽ� 60�� �̻��̸� �հ�, �̸��̸� ���հ�
��, 4�г��� ��� 70�� �̻��̾�� �հ�/ ������ 65��.
*/


import java.util.*;

public class Test_��øif {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int grade, ts;
		
		System.out.print("�г��� �Է� �Ͻÿ�.: ");
		grade = sc.nextInt();
		System.out.print("������ �Է� �Ͻÿ�.: ");
		ts = sc.nextInt();
		
		if( ts >= 60 ) {		
			
			if ( grade == 4){
				
				if( ts>= 70) {
					System.out.println("�հ�");				
				}else 
					System.out.println("���հ�");				
			} else 
				System.out.println("�հ�");			
		} else {
			System.out.println("���հ�");
		}
		
	}

}
