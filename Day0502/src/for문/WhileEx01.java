package for��;
/*
[����]
����ڰ� �Է��ϴ� ������ ����ؼ� ���� ������.
���࿡ 0�� �ԷµǸ� ���ݱ��� �Էµ� ������ �հ踦 ����ϰ� �����ϴ� ���α׷��� �����Ͻÿ�.
��, while�� �̿�
 */
import java.util.Scanner;
public class WhileEx01 {

	public static void main(String[] args) {
		int a, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���ڸ� �Է����ּ���~ �� ");
			a = sc.nextInt();
			
			if(a!=0) {
				sum += a;
				System.out.println("���� �Է� �� �������� ���� "+sum+"�Դϴ�.");
			}else {
				break;
			}
			
		}System.out.print("0�� �ԷµǾ� ����˴ϴ�. �Է� �� �������� ���� "+sum+"�Դϴ�.");
		
		
		
	}

}
