package study;
/*
1. �⵵�� 4�� ������ �������� �� = ����
2. �� �߿��� 100���� ������ �������� �� = ���
3. �ٸ� 400���� ������ �������� �� = ����
- 1���� ��� ��¥�� 365.2425��
- ���� 1�⺸�� 0.0003���� ���.
- ������ ��¥ 31, 30, 28�̸� ���
- ������ ��¥ 29�� ����
 */
import java.util.*;

public class �������_switchcase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year, month;
		int day = 0;
		String s = "";
		
		System.out.print("�⵵�� �Է� �ϼ���: ");
		year = sc.nextInt();
		System.out.print("���� �Է� �ϼ���: ");
		month = sc.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day=31;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		case 2:
			if(year%4==0&&year%100!=0||year%400==0) {
				day = 29;
			}else {
				day = 28;
			}
			break;
		default : day = 0;
			break;
		}
		if(day!=0) {
			System.out.println(year+"�� "+month+"���� "+day+"�ϱ��� �Դϴ�.");
		}else {
			System.out.println("�Է� ����");
		}
			
		}
		

	}
