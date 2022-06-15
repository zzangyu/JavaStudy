package com.obj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// ����ȭ�� ��ü�� ���Ͽ� ����

public class ObjectOutputStreamEx {

	public static void main(String[] args) {

		ObjectOutputStream oos = null;

		try {
			// �޸�(jvm)�� ������ ��ü�� ����ȭ �ؼ� ��Ʈ���� ���ؼ�
			// ����� �� �ִ� ObjectOutputStream ��ü�� �����Ѵ�.
			oos = new ObjectOutputStream(new FileOutputStream("C:/ppp/obj.oob"));

			// ObjectOutputStream�� ���ؼ� ����ȭ�� �� ���Ϸ� ���� data ��ü�� ����
			// ��ü�� �����ϱ��� �ݵ�� Serializable�� �����ϰ� �־���Ѵ�.
			Data data = new Data();
			data.setNo(30);
			data.setName("ȫ�浿");
			data.setMail("hong@naver.com");
			// ObjectOutputStream�� ��ü�� ����ȭ�ؼ� ��Ʈ���� ���� ������ �� �ִ� writeObject() method�� Ȱ���Ѵ�.
			oos.writeObject(data);

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
