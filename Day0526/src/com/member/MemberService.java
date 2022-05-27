package com.member;

import java.util.Scanner;

public class MemberService {

	void process(Action action, Scanner sc) { // Action action이 Action을 상속 받은 뜻 !
		action.execute(sc); // 인터페이스의 다형성을 이용
	}

}
