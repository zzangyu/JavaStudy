package com.obj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {

	public static void main(String[] args) {
		ObjectInputStream ois = null;

		try {
			// 파일에 저장된 객체를 읽어 오기 위해 ObjectInputStream 객체를 생성
			ois = new ObjectInputStream(new FileInputStream("C:/ppp/obj.oob"));

			// ObjectInputStream은 스트림으로부터 읽어들인 직렬화된 객체를
			// 역직렬화해서 객체를 생성할 수 있다.
			// 역직렬화할 때 필요한 class를 찾지 못하면 예외(ClassNotFoundException)가 발생한다.

			Data data = (Data) ois.readObject(); // Data로 형변환 해야된다.

			System.out.println("번호:" + data.getNo());
			System.out.println("이름:" + data.getName());
			System.out.println("메일:" + data.getMail());

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
