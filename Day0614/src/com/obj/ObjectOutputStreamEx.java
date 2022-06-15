package com.obj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// 직렬화된 객체를 파일에 저장

public class ObjectOutputStreamEx {

	public static void main(String[] args) {

		ObjectOutputStream oos = null;

		try {
			// 메모리(jvm)에 생성된 객체를 직렬화 해서 스트림을 통해서
			// 기록할 수 있는 ObjectOutputStream 객체를 생성한다.
			oos = new ObjectOutputStream(new FileOutputStream("C:/ppp/obj.oob"));

			// ObjectOutputStream을 통해서 직렬화된 후 파일로 기억될 data 객체를 생성
			// 객체를 생성하기전 반드시 Serializable을 구현하고 있어야한다.
			Data data = new Data();
			data.setNo(30);
			data.setName("홍길동");
			data.setMail("hong@naver.com");
			// ObjectOutputStream을 객체를 직렬화해서 스트림을 통해 저장할 수 있는 writeObject() method를 활용한다.
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
