package exception;

import java.util.Scanner;

public class ExceptionEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int[] aa = { 1, 2 };
			System.out.println(aa[3]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�ε��� �Ѿ��ڳ�");
		} finally {
			System.out.println("���̳θ�~~~");
			sc.close();
		}

	}

}
