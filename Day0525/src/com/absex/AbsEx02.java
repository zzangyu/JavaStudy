package com.absex;

public abstract class AbsEx02 extends AbsEx01 {
	@Override
	public int getA() { // 부모의 추상 메소드를 재정의
		return a; // 부모의 멤버 변수
	}

	@Override
	public abstract String getStr();
}
