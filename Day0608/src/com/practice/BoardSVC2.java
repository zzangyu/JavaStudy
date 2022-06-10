package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BoardSVC2 {

	ArrayList<HashMap<String, String>> boardList;

	public BoardSVC2() {
		boardList = new ArrayList<HashMap<String, String>>();
	}

	public void writeArticle(Scanner sc) {
		System.out.println("게시판 글을 작성하세요.");
		System.out.print("작성자: ");
		String register = sc.next();
		System.out.print("이메일: ");
		String email = sc.next();
		System.out.print("비밀번호: ");
		String pw = sc.next();
		System.out.print("제목: ");
		String subject = sc.next();
		System.out.print("글 내용: ");
		String content = sc.next();
		HashMap<String, String> boardMap = new HashMap<String, String>();
		boardMap.put("register", register);
		boardMap.put("email", email);
		boardMap.put("pw", pw);
		boardMap.put("subject", subject);
		boardMap.put("content", content);

		addArticle(boardMap);
	}

	private void addArticle(HashMap<String, String> boardMap) {
		boardList.add(boardMap);
	}

	public void listArticle(Scanner sc) {
		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				System.out.println("작성자:" + boardList.get(i).get("register"));
				System.out.println("이메일:" + boardList.get(i).get("email"));
				System.out.println("비밀번호:" + boardList.get(i).get("pw"));
				System.out.println("제목:" + boardList.get(i).get("subject"));
				System.out.println("글 내용" + boardList.get(i).get("content") + "\n");
			}
		} else {
			System.out.println("등록된 게시글이 없습니다.");
		}
	}

	public void deleteArticle(Scanner sc) {
		int limit = 0;
		while (limit < 3) {
			if (limit > 0) {
				System.out.println(3 - limit + "번 남았습니다.");
			}
			System.out.println("\n게시글을 제거할 때는 글의 작성자와 비밀번호를 입력하세요.");
			System.out.print("작성자: ");
			String register = sc.next();
			System.out.print("비밀번호: ");
			String pw = sc.next();
			deleteArticle(register, pw);
			if (limit == 2) {
				System.out.print("아이디 또는 비밀번호가 맞지 않아 종료합니다. ");
				System.exit(0);
			}
			limit++;
		}
	}

	private void deleteArticle(String register, String pw) {
		int limit = 0;
		if (boardList.size() > 0) {
			int index = -1;

			for (int i = 0; i < boardList.size(); i++) {
				if (boardList.get(i).get("register").equals(register)) {
					if (boardList.get(i).get("pw").equals(pw)) {
						boardList.remove(boardList.get(i));
						index = 1;
						System.out.println(register + "님의 게시글이 삭제되었습니다.");
					}
				}
			}
			if (index == -1) { // 내가 찾는 글이 없을 때, 이름&비밀번호가 맞지 않을 때
				System.out.println("해당 글의 작성자&비밀번호의 정보와 일치하지 않습니다.");
			}

		} else {
			System.out.println("등록된 게시글이 없습니다.");
			return;
		}

	}

	public void searchArticle(Scanner sc) {
		System.out.print("이름을 입력해주세요.");
		String name = sc.next();
		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				if (boardList.get(i).get("register").equals(name)) {
					System.out.println("작성자:" + boardList.get(i).get("register"));
					System.out.println("이메일:" + boardList.get(i).get("email"));
					System.out.println("비밀번호:" + boardList.get(i).get("pw"));
					System.out.println("제목:" + boardList.get(i).get("subject"));
					System.out.println("글 내용" + boardList.get(i).get("content") + "\n");
				}
			}
		} else {
			System.out.println("등록된 게시글이 없습니다.");
		}
	}

	public void updateArticle(Scanner sc) {
		System.out.println("이름과 비밀번호를 입력해주세요.");
		System.out.print("이름: ");
		String register = sc.next();
		System.out.print("비밀번호: ");
		String pw = sc.next();

		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				if (boardList.get(i).get("register").equals(register)) {
					if (boardList.get(i).get("pw").equals(pw)) {
						boardList.remove(i);
						writeArticle(sc);
					}
				}
			}
		} else {
			System.out.println("등록된 게시글이 없습니다.");
		}
	}
}
