package com.inner;

public class OuterEx { // Member 내부 클래스의 구성
	public class InnerEx { // 캡슐화! 밖에서 볼 땐 OuterEx만 보인다.
		int x = 5; // 외부에서 보이지 않음
	}
}
