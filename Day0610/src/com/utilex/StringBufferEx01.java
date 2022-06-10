package com.utilex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//���۶� ?
//- ���۴� �����͸� �Ѱ����� �ٸ� �Ѱ����� �����ϴ� ���� �Ͻ������� �� �����͸� �����ϴ� �޸𸮿���(�ӽø޸�)
//���۸��̶� ?
//- ���۸� ä��� ������ �ǹ��Ѵ�.

public class StringBufferEx01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("���ڿ� �Է�: ");
//		String str = br.readLine(); // : ���Ŀ� �ԷµǴ� ������ ���۴�! enter�� ġ�� ���۰� ������°�(�޸𸮷� �̵���)
//		System.out.println(str);

		StringBuffer sb = new StringBuffer("JAVA");
		System.out.println(sb);
		System.out.println(sb.capacity()); // java 4�� + �⺻ 16��
		sb.append("1.8"); // �߰�
		System.out.println(sb);
		sb.delete(3, 5);// 3�������� 5�������� 3,4�� ������
		System.out.println(sb);
		sb.insert(3, "A1");
		System.out.println(sb);
		sb.replace(4, 7, "������");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}

}
