package study;

public class CircleExam {

	public static void main(String[] args) {
	    /*
		* �� Ǯ��
		*double Area, PI, Around;
		*int r = 5;
		*PI = Math.PI;
		*Area = r*r*PI;
		*Around = r*2*PI;
		
		*System.out.println(Area);
		*System.out.println(Around);
		*/
		
		/*
		 * 1. �������� �� �ʱ�ȭ
		 * double area =0;
		 * int r = 5;
		 * 
		 * 2. ���� �� ó��
		 * 	area = r*r*(Math.PI);
		 * 
		 * 3. ���
		 * System.out.println("���� ���̴� "+area+"�Դϴ�.");
		 * System.out.printf("���� ���̴� %.3f�Դϴ�.", area);
		 */
		
		 double area, around =0;
		 int r = 5;
		 around = r*2* (Math.PI);
		 area = r*r*(Math.PI);
		  
		 System.out.println("���� ���̴� "+area+"�Դϴ�.");
		 System.out.printf("���� ���̴� %.2f�Դϴ�.%n", area); // %n \n�̶� ����
		 System.out.printf("���� �ѷ��� %.2f�Դϴ�.%n", around);
		
		 
	}

}
