package for��;
/*
[����]
1~100������ ���� �߿��� 2, 3, 5, 7�� ����� ������ ���� ���࿡ 
10���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class ForExam01 {

	public static void main(String[] args) {
		int a, b = 1;
		for(a = 1; a<101; a++) {
			if((a%2!=0)&&(a%3!=0)&&(a%5!=0)&&(a%7!=0)){
			System.out.printf("%3d%c ", a, (b++%10!=0) ?' ': '\n');
			}
		}
	}

}


