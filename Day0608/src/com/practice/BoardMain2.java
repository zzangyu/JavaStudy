package com.practice;

import java.util.Scanner;

public class BoardMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardSVC2 svc = new BoardSVC2();

		boolean isStop = false;

		do {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 게시판 글 쓰기");
			System.out.println("2. 게시판 목록 보기");
			System.out.println("3. 게시판 글 삭제");
			System.out.println("4. 게시판 글 검색");
			System.out.println("5. 게시판 글 수정");
			System.out.println("6. 종료");
			String menu = sc.next();
			switch (menu) {
			case "1":
				svc.writeArticle(sc);
				break;
			case "2":
				svc.listArticle(sc);
				break;
			case "3":
				svc.deleteArticle(sc);
				break;
			case "4":
				svc.searchArticle(sc);
				break;
			case "5":
				svc.updateArticle(sc);
				break;
			case "6":
				isStop = true;
			}

		} while (!isStop);

	}

}
