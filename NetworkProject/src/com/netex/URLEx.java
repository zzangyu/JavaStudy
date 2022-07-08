package com.netex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {

	public static void main(String[] args) {
		// URL (uniform resource locator)에 대한 정보를 가지고 있는 클래스
		// 프로토콜, 포트번호, 호스트명, 자원의 경로명, 쿼리스트링으로 정보를 얻는다.
		BufferedReader br = null;

		try {
			URL url = new URL("http://www.daum.net/index.html");
			System.out.println("프로토콜: " + url.getProtocol());
			System.out.println("호스트: " + url.getHost());
			System.out.println("포트번호: " + url.getPort());
			System.out.println("자원의 경로: " + url.getPath());
			System.out.println("파일: " + url.getFile());

			br = new BufferedReader(new InputStreamReader(url.openStream()));
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (MalformedURLException mue) { // url 잘못 입력했을 때
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
