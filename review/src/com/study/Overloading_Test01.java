package com.study;

class Boiler {
	String maker; // 제조사
	int temp; // 현재 온도를 저장

	void tempUp() {
		// 온도 상승
		temp++;
	}

	// 온도를 20도로 한번에 올린다. overloading !
	void tempUp(int amount) {
		temp = temp + amount;
	}

}

public class Overloading_Test01 {

	public static void main(String[] args) {
		Boiler b = new Boiler();
		System.out.println("현재 온도: " + b.temp);
		b.tempUp();
		System.out.println("tempUp method 호출 후 현재 온도: " + b.temp);
		b.tempUp(20);
		System.out.println("tempUp method(20) 호출 후 현재 온도: " + b.temp);
	}

}
