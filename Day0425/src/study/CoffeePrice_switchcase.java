package study;
/*
 Switch ~ case ���� �̿��Ͽ� Ŀ�� �޴��� ������ �˷��ִ� ���α׷� ����
 Ŀ�Ǹ޴�
 - ���������� 3500��
 - īǪġ�� 3500��
 - ī��� 3500��
 - �Ƹ޸�ī�� 2000��
 */
import java.util.*;
public class CoffeePrice_switchcase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� Ŀ�Ǹ� �帱���? ");
		String order = sc.next();
		int price = 0;
		
		switch(order) {
		case"����������":
		case"īǪġ��":
		case"ī���":
			price = 3500;
			break;
		case"�Ƹ޸�ī��":
			price = 2000;
			break;
		default:
			System.out.println("�޴��� �����ϴ�. �ٽ� �ֹ��ϼ���.");
		}
		
		System.out.println(order+"�� "+price+"�� �Դϴ�.");
		

	}

}
