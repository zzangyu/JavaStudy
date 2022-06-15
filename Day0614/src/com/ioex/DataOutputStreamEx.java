package com.ioex;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataInputStream과 DataOutputStream
 *
 * DataOutputStream
 * - 특정 데이터 타입과 포멧을 유지한채 데이터를 기록하고 읽어올 수 있는 스트림
 * - 특정 데이터 타입과 포멧에 맞게 읽을 수 있느 메소드를 제공함
 * - writeBoolean, readBoolean, readInt, writeInt, readUTF, writeUTF
 *
 */
public class DataOutputStreamEx {

	public static void main(String[] args) {
		// DataOutputStream은 기본 자료형 타입 그대로 스트림을 통해서 기록할 수 있음
		// DataOutputStream은 1차 스트림이 아니기 때문에 다른 스트림을 이용해서 특정 장치와 연결될 수 있다.
		DataOutputStream dos = null; // 2차
		FileOutputStream fos = null; // 1차 / 얘네 둘을 연결해야함

		try {
			// DataOutputStream과 연결된 FileOutputStream(얘가 매개변수로 들어간다.)
			fos = new FileOutputStream("c:/ppp/data.sav");// 파일명 지정
			// 기본 자료형의 타입을 유지한채 기록할 수 있는 DataOutputStream 객체를 생성
			dos = new DataOutputStream(fos);
			int i = 10;
			double d = 3.14;
			String s = "나는 자바를 사랑하지 않는다.";

			// 씁니다..!
			// DataOutputStream은 기본 자료형별로 저장하는 write method가 존재함

			dos.writeInt(i); // 쓴 기록 순서대로 읽어야함
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
