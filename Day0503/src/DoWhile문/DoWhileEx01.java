package DoWhile��;
/*
[����]
����ڷκ��� �ϳ��� ���ڸ� �Է¹��� ����, �� ����ŭ 3�� ����� ����ϴ� ���α׷� �ۼ�
���࿡ ����ڷκ��� 5�� �Է¹޾Ҵٸ� 3, 6, 9, 12, 15�� ����Ͻÿ�.
 */
import java.util.Scanner;

public class DoWhileEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i=1, limit;
		System.out.print("���ڸ� �Է����ּ���~ - ");
		limit = sc.nextInt();
		do {
			System.out.print(i * 3+"  ");
			i++;	
			}while(i<=limit);
		
	}

}