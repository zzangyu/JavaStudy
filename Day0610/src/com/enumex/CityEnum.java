package com.enumex;

public class CityEnum {

	public static void main(String[] args) {

//		System.out.println("���� �α�:" + City.SEOUL.getIngu());

		for (City city : City.values()) {
			System.out.println("�ߺ�ߺ� ����� " + city.getCityName() + "�̶��! �α��� " + city.getIngu() + "�����̶��!");
		}

	}

}
