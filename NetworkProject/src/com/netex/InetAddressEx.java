package com.netex;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {

		// InetAddress 객체는 생성자가 아닌 static method를 이용해서 객체를 생성한다.

		try {

			InetAddress ipinfo1 = InetAddress.getByName("www.daum.net"); // ip 주소 얻기
			String ip = ipinfo1.getHostAddress();
			System.out.println("ip 주소: " + ip);

			InetAddress[] ipArray = InetAddress.getAllByName("www.daum.net");
			for (InetAddress tempip : ipArray) {
				System.out.println(tempip);
			}

			// 현재 내 컴퓨터 ip 정보
			InetAddress myHost = InetAddress.getLocalHost();
			System.out.println("Host ip: " + myHost.getHostAddress());
			System.out.println("Host name: " + myHost.getHostName());

		} catch (UnknownHostException uhe) {
			uhe.printStackTrace();
		}

	}

}
