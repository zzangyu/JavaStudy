package com.obj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {

	public static void main(String[] args) {
		ObjectInputStream ois = null;

		try {
			// ���Ͽ� ����� ��ü�� �о� ���� ���� ObjectInputStream ��ü�� ����
			ois = new ObjectInputStream(new FileInputStream("C:/ppp/obj.oob"));

			// ObjectInputStream�� ��Ʈ�����κ��� �о���� ����ȭ�� ��ü��
			// ������ȭ�ؼ� ��ü�� ������ �� �ִ�.
			// ������ȭ�� �� �ʿ��� class�� ã�� ���ϸ� ����(ClassNotFoundException)�� �߻��Ѵ�.

			Data data = (Data) ois.readObject(); // Data�� ����ȯ �ؾߵȴ�.

			System.out.println("��ȣ:" + data.getNo());
			System.out.println("�̸�:" + data.getName());
			System.out.println("����:" + data.getMail());

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
