package com.starcraft;

public abstract class Unit { // 추상 클래스 : 공통적인 기능만 모아서 만듦
	// 메세지 전달, 이동

	int x, y; // 좌표로 사용

	abstract void move(int x, int y);

	abstract void stop();

	abstract void message();

}
