package study;

/*
����ڷ� ���� ������ ������ �Է¹޾�
1���� �Է¹��� �������� ��ü�� �հ�, ¦���� �հ�, Ȧ���� ���� ���� ����ϴ� ���α׷��� �����ϰ�
10������ �հ踦 ����Ͻÿ�.
 */
import java.util.*;

public class �հ豸�ϱ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, evensum, oddsum, total;
		evensum = oddsum = total = 0;
		System.out.println("���ڸ� �Է����ּ���.");
		i = sc.nextInt();

		for (int k = 1; k <= i; k++) {
			total = total + k;
			if(k%2==0) {
				evensum += k;
			}else {
				oddsum += k;
			}total = evensum+oddsum;
			if(k%10==0){
				System.out.printf("1����%d������ ¦���� ���� %d\n", k, evensum);
				System.out.printf("1����%d������ Ȧ���� ���� %d\n", k, oddsum);
				System.out.printf("1����%d������ ���� %d\n", k, total);
			}
			
		}
		System.out.printf("1~%d �� : %d",i, total);
		
		
	}
}
