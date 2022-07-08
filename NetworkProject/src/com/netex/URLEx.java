package com.netex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {

	public static void main(String[] args) {
		// URL (uniform resource locator)�� ���� ������ ������ �ִ� Ŭ����
		// ��������, ��Ʈ��ȣ, ȣ��Ʈ��, �ڿ��� ��θ�, ������Ʈ������ ������ ��´�.
		BufferedReader br = null;

		try {
			URL url = new URL("http://www.daum.net/index.html");
			System.out.println("��������: " + url.getProtocol());
			System.out.println("ȣ��Ʈ: " + url.getHost());
			System.out.println("��Ʈ��ȣ: " + url.getPort());
			System.out.println("�ڿ��� ���: " + url.getPath());
			System.out.println("����: " + url.getFile());

			br = new BufferedReader(new InputStreamReader(url.openStream()));
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (MalformedURLException mue) { // url �߸� �Է����� ��
			mue.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

	}

}
