package study;

/*
���Ѵ�� �ΰ��� ������ �Է¹޾� �հ踦 ���ϴ� ���α׷� �ۼ��Ͻÿ�.
*/
import java.util.*;
public class ���丮��Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, sum;
		n1 = n2 = 1;
		sum = 0;
		for(;;) {
			System.out.println("ù��° ����: ");
			n1 = sc.nextInt();
			if(n1==0) 
				break;
			System.out.println("�ι�° ����: ");
			n2 = sc.nextInt();
			sum = n1+n2;
				System.out.println(n1+"�� "+n2+"�� ���� "+sum);
			
		}

	}

}
