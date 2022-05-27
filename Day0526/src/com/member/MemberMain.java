package com.member;

import java.util.Scanner;

/*
전체 클래스 구조

MemberMain: 실행 클래스

MemberVO: 회원 정보를 저장하는 클래스

Action: 메소드를 정의한 인터페이스
MemberService: 인터페이스를 상속하여 구현함

목록, 회원등록, 삭제, 수정
WriterAction: 등록	AddAction
ListAction: 목록		ListAction
DeleteAction: 삭제	DeleteAction
UpdateAction: 수정	UpdateAction


 */

public class MemberMain {
	static MemberVO[] members;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		members = new MemberVO[0];
		MemberService memberService = new MemberService();

		boolean isStop = false;

		do {
			System.out.println("다음 메뉴 중 하나를 선택하세요.");
			System.out.println("[1 - 회원 가입]");
			System.out.println("[2 - 회원 목록 보기]");
			System.out.println("[3 - 회원 정보 삭제]");
			System.out.println("[4 - 회원 정보 수정]");
			System.out.println("[5 - 종료]");

			String command = sc.next();

			switch (command) {
			case "1":
				WriteAction writeAction = new WriteAction();
//				writeAction.execute(sc);
				memberService.process(writeAction, sc);
				break;
			case "2":
				ListAction listAction = new ListAction();
				memberService.process(listAction, sc);
				break;
			case "3":
				DeleteAction deleteaction = new DeleteAction();
				memberService.process(deleteaction, sc);
				break;
			case "4":
				UpdateAction updateaction = new UpdateAction();
				memberService.process(updateaction, sc);
				break;
			case "5":
				isStop = true;
			}
		} while (!isStop);

	}

}
