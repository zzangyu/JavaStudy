package com.enumex;

public enum City {

	SEOUL("����", 1000), BUSAN("�λ�", 350), DAEGU("�뱸", 250), INCHON("��õ", 200);

	private final String cityName;
	private final int ingu;

	private City(String cityName, int ingu) {
		this.cityName = cityName;
		this.ingu = ingu;
	}

	public String getCityName() {
		return cityName;
	}

	public int getIngu() {
		return ingu;
	}

}
