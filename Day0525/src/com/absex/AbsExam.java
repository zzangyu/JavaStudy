package com.absex;

public class AbsExam extends AbsEx02 {
	@Override
	public String getStr() { // AbsEx02의 추상 메소드를 재정의
		return str; // AbsEx01의 멤버 변수
	}

	public static void main(String[] args) {

	}

}
