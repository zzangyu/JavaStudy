package study;
/*
[����]
���� ������ �Է¹޾� �Է¹��� ���� ����� ���ϴ� ���α׷��� ����
��, ���� �Ǽ��� �ԷµǸ� ����Ͻÿ�.
���� �Ǽ� �Է� : 1.1
���� �Ǽ� �Է� : 2.2
���� �Ǽ� �Է� : 3.3
���� �Ǽ� �Է� : 4.4
���� �Ǽ� �Է� : -5.5
���ݱ����� ��� : 2.2
*/
import java.util.*;
public class for��Ex4 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float a, sum=0, avrg=0, n=1;
	
	System.out.println("�Ǽ��� �Է����ּ���.");
	a = sc.nextFloat();
	if(a>0) {
	for(;a>0;) {
		sum=sum+a;
		System.out.println("�Ǽ��� �� �Է����ּ���.");
		a = sc.nextFloat();
		n+=1;
		}
	}
	avrg = sum/n;
	System.out.printf("����� %.1f", avrg);
	}
}
