package while��;
/*
[����]
�ݶ�, ���̴�, ����ƾ, ���ڼ���, ���̽�, ���Ͻ��� ������ ���Ǳ� ���α׷��� �����Ͻÿ�.
��, 0�� �Է��ϸ� ����
 */
import java.util.Scanner;
public class WhileExam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select=1;
		String str = " ";
		while(select != 0) {
		System.out.println("'1 - �ݶ�, 2 - ���̴�, 3 - ����ƾ, 4 - ���ڼ���, 5 - ���̽�, 6 - ���Ͻ�, 0 - ������' �̷��� �ִµ� �� ������?");
		select = sc.nextInt();
		
		switch (select) {
		case 1:	str = "�ݶ�"; 	break;
		case 2:	str = "���̴�";	break;
		case 3:	str = "����ƾ";	break;
		case 4:	str = "���ڼ���";	break;
		case 5:	str = "���̽�";	break;
		case 6:	str = "���Ͻ�";	break;
		case 0:	str = "��";	break;

		default:
			str = "�����! �ٽ� �Է������~!";
			break;
		}
		System.out.println(str+"��(��) �����ϼ̽��ϴ�");
		
		
		}
	}
	

}
