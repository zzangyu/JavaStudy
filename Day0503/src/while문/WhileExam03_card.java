package while��;

/*
[����]
0�������� 99���� ������ ���� ���� ī�带 ���� ����� �� ī�� ���� ���ߴ� ������
ī����� ���� 77�̶�� ���� ���ߴ� ����� 55�� �Է��ϸ� 
�� ���� �ٽ� 70�� �Է��ϸ� �� ���� ��� ������ ������ �������鼭 ������ ���ߴ� ����
������ �ݺ��ϱ� ���� y/n�� ����, n�� ���� ������
��ǻ�Ͱ� ���� ���� ���Ƿ� �����ϱ� ���� Random Ŭ������ �����
Random Ŭ���� ������
 */
import java.util.Random;
import java.util.Scanner;

public class WhileExam03_card {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = " ";
		Random r = new Random();
		int i = r.nextInt(100);
		int a = 0; // ����ڰ� �Է��� Ƚ��
		while (true) {
			System.out.print("������ ���Կ�~? ");
			int j = sc.nextInt();
			a++;
			if (j > i) {
				System.out.println("�� ����! �Է��Ͻ� �� �ִ� ������ 0~"+j+"���� �Դϴ�.");
			} else if (j < i) {
				System.out.println("�� ����!�Է��Ͻ� �� �ִ� ������ "+j+"���� 99���� �Դϴ�.");
			} else if (j == i) {
				System.out.println(a+"������ ������ϴ�.");
				System.out.print("���� �� �ҷ���? (y/n)");
				yn = sc.next();
					if (yn.equals("n")) {
						System.exit(0);
						break;
				} else {
					i = r.nextInt(100);
				}
			}
		}
	}
}