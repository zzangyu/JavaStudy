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
public class for��Ex4_�ٸ�Ǯ�� {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float input, total, count;
	input = total =  count = 0.0f;
	
	for(;input>=0;) {
		total = total + input;
		System.out.println("�Ǽ��� �Է����ּ���.");
		input = sc.nextFloat();
		count++;
		}

	System.out.printf("����� %.1f", total/count);
	}
}
