package study;

public class for��Ex01 {

	public static void main(String[] args) {
	// 1���� 10������ �հ� : 55
		
		int i, k, sum;
		sum = 0;
		i=0;
		for(;i<3; i++) {
			for(k = 0; k<3; k++) {
			sum = sum + i+k;
			System.out.printf("%d, %d�̸� "+sum+"�Դϴ�.\n", i, k);
			}
		}
		System.out.println("�հ�� "+sum+"�Դϴ�.");
	}

}
