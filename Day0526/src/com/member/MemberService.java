package com.member;

import java.util.Scanner;

public class MemberService {

	void process(Action action, Scanner sc) { // Action action�� Action�� ��� ���� �� !
		action.execute(sc); // �������̽��� �������� �̿�
	}

}
