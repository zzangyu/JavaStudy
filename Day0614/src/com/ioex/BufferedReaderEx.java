package com.ioex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {

	public static void main(String[] args) {
		InputStreamReader isr = null;
		FileInputStream fis = null;
		BufferedReader br = null;

		try {
			fis = new FileInputStream("c:/ppp/hello.txt");
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);

			// ���� �ϳ��� �о���� ���ڿ��� ������ ����
			String str = null;
			// readLine() ���๮�ڸ� ������ ���๮�� ���������� ���ڿ��� ��ȯ�ϰ� ��Ʈ���� ���� �����ϸ� null�� ��ȯ�Ѵ�.

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (isr != null) {
					isr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
