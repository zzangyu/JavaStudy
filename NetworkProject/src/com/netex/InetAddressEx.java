package com.netex;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {

		// InetAddress ��ü�� �����ڰ� �ƴ� static method�� �̿��ؼ� ��ü�� �����Ѵ�.

		try {

			InetAddress ipinfo1 = InetAddress.getByName("www.daum.net"); // ip �ּ� ���
			String ip = ipinfo1.getHostAddress();
			System.out.println("ip �ּ�: " + ip);

			InetAddress[] ipArray = InetAddress.getAllByName("www.daum.net");
			for (InetAddress tempip : ipArray) {
				System.out.println(tempip);
			}

			// ���� �� ��ǻ�� ip ����
			InetAddress myHost = InetAddress.getLocalHost();
			System.out.println("Host ip: " + myHost.getHostAddress());
			System.out.println("Host name: " + myHost.getHostName());

		} catch (UnknownHostException uhe) {
			uhe.printStackTrace();
		}

	}

}
