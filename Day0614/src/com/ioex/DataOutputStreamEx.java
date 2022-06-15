package com.ioex;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataInputStream�� DataOutputStream
 *
 * DataOutputStream
 * - Ư�� ������ Ÿ�԰� ������ ������ä �����͸� ����ϰ� �о�� �� �ִ� ��Ʈ��
 * - Ư�� ������ Ÿ�԰� ���信 �°� ���� �� �ִ� �޼ҵ带 ������
 * - writeBoolean, readBoolean, readInt, writeInt, readUTF, writeUTF
 *
 */
public class DataOutputStreamEx {

	public static void main(String[] args) {
		// DataOutputStream�� �⺻ �ڷ��� Ÿ�� �״�� ��Ʈ���� ���ؼ� ����� �� ����
		// DataOutputStream�� 1�� ��Ʈ���� �ƴϱ� ������ �ٸ� ��Ʈ���� �̿��ؼ� Ư�� ��ġ�� ����� �� �ִ�.
		DataOutputStream dos = null; // 2��
		FileOutputStream fos = null; // 1�� / ��� ���� �����ؾ���

		try {
			// DataOutputStream�� ����� FileOutputStream(�갡 �Ű������� ����.)
			fos = new FileOutputStream("c:/ppp/data.sav");// ���ϸ� ����
			// �⺻ �ڷ����� Ÿ���� ������ä ����� �� �ִ� DataOutputStream ��ü�� ����
			dos = new DataOutputStream(fos);
			int i = 10;
			double d = 3.14;
			String s = "���� �ڹٸ� ������� �ʴ´�.";

			// ���ϴ�..!
			// DataOutputStream�� �⺻ �ڷ������� �����ϴ� write method�� ������

			dos.writeInt(i); // �� ��� ������� �о����
			dos.writeDouble(d);
			dos.writeUTF(s);

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException ie2) {
				ie2.printStackTrace();
			}
			try {
				if (dos != null) {
					dos.close();
				}
			} catch (IOException ie3) {
				ie3.printStackTrace();
			}
		}

	}

}
