package study;

/*
[����]
�� ������ �����ڸ� �Է¹޾Ƽ� ����ϴ� ���α׷��� ����
switch~case ���
 */

import java.io.*;

public class SwitchCase_example001 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2, total=0;
		char op;

		System.out.print("ù��° ����: ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�: ");
		op = (char) System.in.read();
			System.in.read();
			System.in.read();
		System.out.print("�ι�° ����: ");
		num2 = Integer.parseInt(br.readLine());

		switch (op) {
		case '+':
			total = num1+num2;
			System.out.println(num1+"+"+num2+"="+total);
			break;
		case '-':
			total = num1-num2;
			System.out.println(num1+"-"+num2+"="+total);
			break;
		case '*':
			total = num1*num2;
			System.out.println(num1+"*"+num2+"="+total);
			break;
		case '/':
			total = num1/num2;
			System.out.println(num1+"/"+num2+"="+total);
			break;
		case '%':
			total = num1%num2;
			System.out.println(num1+"%"+num2+"="+total);
			break;
		default:
			System.out.print("�ߺ��! �ߺ�! �ߺ�! �߸��� �����ڸ� �Է��ϼ̽��ϴ�.");
			break;
		}
		
	}

}
