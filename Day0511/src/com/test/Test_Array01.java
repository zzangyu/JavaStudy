package com.test;

import java.util.Scanner;

/*
[문제]
학생 수를 입력 받아서 입력 받은 인원수 만큼 학생의 이름과 전화번호를 입력받고 (이름과 전화번호는 공백으로 구분)
입력 받은 내용을 전체를 출력하는 프로그램을 작성하시오.
단, 배열을 이용하여 작성하시오.

학생수:3
이름 전화번호 입력(1)[공백구분] : 홍길동 010-1111-1111
이름 전화번호 입력(2)[공백구분] : 이순신 010-2222-2222
이름 전화번호 입력(3)[공백구분] : 강감찬 010-3333-3333

-----------------------
입력받은 학생 수 : 3
-----------------------
이름     전화번호
홍길동 010-1111-1111
이순신 010-2222-2222
강감찬 010-3333-3333
-----------------------
 */
public class Test_Array01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int student;
		student = sc.nextInt();
		String[] name = new String[student];
		String[] phno = new String[student];

		for (int i = 0; i < student; i++) {
			System.out.print("이름 전화번호 입력(" + (i + 1) + "):[공백구분]: ");
			name[i] = sc.next();
			phno[i] = sc.next();
		}
		System.out.println("------------------------");
		System.out.printf("입력 받은 학생 수: %d\n", student);
		System.out.println("------------------------");
		System.out.println("이름           전화번호");
		System.out.println("------------------------");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "  " + phno[i]);
		}
		System.out.println("------------------------");
	}

}
