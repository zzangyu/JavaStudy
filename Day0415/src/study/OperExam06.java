package study;

// [����] ���� 35�� ¦������ Ȧ������ �����ϴ� ���α׷� ����. ��, ���� �����ڸ� Ȱ���Ͻÿ�.

public class OperExam06 {

	public static void main(String[] args) {
		
		/*
		int a = 20, b = 30, max;
		max = a > b ? ++a : ++b; 
		�����ڴ� �ΰ�(?, :), ���� 3��. ���� ~���(?) ~�ϰ� �ƴϸ�(:) ~�ض�
		�����̹Ƿ� ++b�� �ؼ� b���� 31�� �ȴ�. max�� 31�� �ȴ�.
		
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		System.out.println("max :"+max);
		*/

		int i = 35;
		String result; // ���ڸ� ���ϱ� string
		
		result = i % 2 ==0 ? "¦��" : "Ȧ��";
		
		System.out.println("���� 35�� "+result+"�Դϴ�.");

	}

}
