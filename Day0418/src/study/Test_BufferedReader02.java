package study;
/*
[����]
������ �⵵�� �Է¹޾Ƽ� �Է¹��� �⵵�� �������� ��������� �����ϴ� ���α׷� ����
�Է��� BufferedReader
if or ���׿����� Ȱ�� ��ø�� ���� ��
�������� ����
-�⵵�� 4�� ����̸鼭 100�� ����� �ƴϰų�
 400�� ����̸� ���� �׷��� ������ ���

 */
import java.io.*;
public class Test_BufferedReader02 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;
		String s = "";
		
		System.out.print("�⵵�� �Է� �ϼ���: ");
		year = Integer.parseInt(br.readLine());
		
		if(year%4==0&&year%100!=0||year%400==0) {
			s = "����";
		}else {
				s = "���";
		}
		System.out.printf("%d�⵵�� %s�Դϴ�.", year, s);
		
	}

}
/*
[���׿����� ��]
s=((year%4==0)&&(year%100!=0)||(year%400==0))?"����":"���";
System.out.println(year+"==>"+s);
*/