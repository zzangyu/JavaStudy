package com.ioex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// �ؽ�Ʈ ���Ͽ� ���� ���
public class BufferedWriterEx {

	public static void main(String[] args) {

		// Buffered Stream : Stream�� �а� ���� ����� ���� ��Ʈ�� ���ο� ���۸� ������ �ִ� ��Ʈ��
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter("c:/ppp/hello.txt");
			bw = new BufferedWriter(fw);
			bw.write("���� ���� �帮�ٴ�,, @");
			bw.newLine(); // ������ �ٲ��ݴϴ�!
			bw.write("����? �帮�ٴ�! �׷��ٴ�!");
			bw.newLine(); // ������ �ٲ��ݴϴ�!
			bw.write("�´ٴ�!");
			bw.flush();

		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e3) {
				e3.printStackTrace();
			}
		}

	}

}
