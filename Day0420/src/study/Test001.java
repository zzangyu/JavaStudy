package study;
/*
[����]
������ ������ �Է¹޾� ¦������, Ȧ������, 0������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
��, �̿��� ���� ������ ���� �Ұ��� ���
 */
import java.util.*;

public class Test001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		String s = "";
		char c;
		
		System.out.print("������ �Է����ּ���.");
		i = sc.nextInt();
		
		
		if(i%2==0){
			s = "¦��";
			if(i==0) {
				s = "0";					
			}
		}else if (i%2==1){
			s = "Ȧ��";
		}
		System.out.print("�Է¹��� ������ "+s+"�Դϴ�.");
		
	}
}
