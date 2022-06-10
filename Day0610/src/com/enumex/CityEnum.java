package com.enumex;

public class CityEnum {

	public static void main(String[] args) {

//		System.out.println("서울 인구:" + City.SEOUL.getIngu());

		for (City city : City.values()) {
			System.out.println("삐빅삐빅 여기는 " + city.getCityName() + "이라능! 인구는 " + city.getIngu() + "만명이라능!");
		}

	}

}
