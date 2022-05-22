package study;
/*
1. �⵵�� 4�� ������ �������� �� = ����
2. �� �߿��� 100���� ������ �������� �� = ���
3. �ٸ� 400���� ������ �������� �� = ����
- 1���� ��� ��¥�� 365.2425��
- ���� 1�⺸�� 0.0003���� ���.
 */
import java.io.*;

public class �������_������Ǯ��_switchcase {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year, month;
		int day = 0;
		String s = "";
		
		System.out.print("�⵵�� �Է� �ϼ���: ");
		year = Integer.parseInt(br.readLine());
		System.out.print("���� �Է� �ϼ���: ");
		month = Integer.parseInt(br.readLine());
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			s = (year%4==0&&year%100!=0||year%400==0)?"����":"���";
			day = 31;
			System.out.println(year+"���� "+s+"�̰�, "+day+"�ϱ��� �Դϴ�.");
			break;
		case 4: case 6: case 9: case 11:
			s = (year%4==0&&year%100!=0||year%400==0)?"����":"���";
			day = 30;
			System.out.println(year+"���� "+s+"�̰�, "+day+"�ϱ��� �Դϴ�.");
			break;
		case 2:
			s = (year%4==0&&year%100!=0||year%400==0)?"����":"���";
			day = (year%4==0&&year%100!=0||year%400==0)? 29 : 28 ;
			System.out.println(year+"���� "+s+"�̰�, "+day+"�ϱ��� �Դϴ�.");
			break;
		default :
			System.out.println("�ٽ� �Է����ּ���!!!");
			break;
		}
		

	}

}