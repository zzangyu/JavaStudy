package study;

/*
[����]
5���� ������ ������ �Է¹޾Ƽ� ������ ����� ���ϰ� ����� �̿��Ͽ� ������ �����ϴ� ���α׷��� �����Ͻÿ�.
��, ������ A(90�� �̻�), B(80�� �̻�), C(70�� �̻�), D(60�� �̻�), F(60�� �̸�)
 */

import java.util.*;

public class Tset_����if {

	public static void main(String[] args) {
		
		int kor, math, eng, sci, his, total=0, avrg=0;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ������ �Է��Ͻÿ�.: ");
		math = sc.nextInt();
		System.out.print("������ ������ �Է��Ͻÿ�.: ");
		kor = sc.nextInt();
		System.out.print("������ ������ �Է��Ͻÿ�.: ");
		eng = sc.nextInt();
		System.out.print("������ ������ �Է��Ͻÿ�.: ");
		sci = sc.nextInt();
		System.out.print("������ ������ �Է��Ͻÿ�.: ");
		his = sc.nextInt();
		
		total = kor + math + eng + sci + his;
		avrg = total/5;
		

		
		if(avrg>=90) {
			grade = 'A';
			System.out.print("����� ���������� ��������: "+kor+" ��������: "+math+" ��������: "+eng+" ��������: "+sci+" ��������: "+his+"�̸�,"+"����: "+total+", "+"���: "+avrg+","+"����: "+grade+"�Դϴ�.");
		}else if (avrg>=80) {
			grade = 'B';
			System.out.println("����� ���������� ��������: "+kor+" ��������: "+math+" ��������: "+eng+" ��������: "+sci+" ��������: "+his+"�̸�,"+"����: "+total+", "+"���: "+avrg+","+"����: "+grade+"�Դϴ�.");
		}else if (avrg>=70) {
			grade = 'C';
			System.out.println("����� ���������� ��������: "+kor+" ��������: "+math+" ��������: "+eng+" ��������: "+sci+" ��������: "+his+"�̸�,"+"����: "+total+", "+"���: "+avrg+","+"����: "+grade+"�Դϴ�.");
		}else if (avrg>=60) {
			grade = 'D';
			System.out.println("����� ���������� ��������: "+kor+" ��������: "+math+" ��������: "+eng+" ��������: "+sci+" ��������: "+his+"�̸�,"+"����: "+total+", "+"���: "+avrg+","+"����: "+grade+"�Դϴ�.");
		}else if (avrg<60) {
			grade = 'F';
			System.out.println("����� ���������� ��������: "+kor+" ��������: "+math+" ��������: "+eng+" ��������: "+sci+" ��������: "+his+"�̸�,"+"����: "+total+", "+"���: "+avrg+","+"����: "+grade+"�Դϴ�.");
		
			
			
		}
		
		

	}

}
