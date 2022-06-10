package com.practice;

import java.util.HashMap;
import java.util.Scanner;

public class BoardSVC2 {
	HashMap<String, String> board;
	HashMap<String, BoardVO2> board_;

	public BoardSVC2() {
		board = new HashMap<String, String>();
		board_ = new HashMap<String, BoardVO2>();
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
		BoardVO2 boardVO2 = new BoardVO2(register, subject, email, content, pw);
		addArticle(pw, boardVO2);
	}

	private void addArticle(String pw, BoardVO2 boardVO2) {
		board_.put(pw, boardVO2);
	}

	public void listArticle(Scanner sc) {
		if (board_.size() > 0) {
			for (int i = 0; i < board_.size(); i++) {
				System.out.println(board_.get(i));
			}
		} else {
			System.out.println("등록된 게시글이 없습니다.");
		}
	}

	public void deleteArticle(Scanner sc) {
		System.out.println("게시글을 제거할 때는 글의 작성자와 비밀번호를 입력하세요.");
		System.out.print("작성자: ");
		String register = sc.next();
		System.out.print("비밀번호: ");
		String pw = sc.next();

		deleteArticle(register, pw);
	}

	private void deleteArticle(String register, String pw) {
		if (board_.size() > 0) {
			int index = -1;

			for (int i = 0; i < board_.size(); i++) {
				if (board_.get(i).getRegister().equals(register)) {
					if (board_.get(i).getPw().equals(pw)) {
						board_.remove(board_.get(i));
						index = 1;
						System.out.println(register + "님의 게시글이 삭제되었습니다.");
					}
				}
			}
			if (index == -1) { // 내가 찾는 글이 없을 때, 이름&비밀번호가 맞지 않을 때
				System.out.println("해당 글의 작성자&비밀번호의 정보와 일치하지 않습니다.");
				return;
			}

		} else {
			System.out.println("등록된 게시글이 없습니다.");
		}
	}

	public void searchArticle(Scanner sc) {
		System.out.print("이름을 입력해주세요.");
		String name = sc.next();
		if (board_.size() > 0) {
			for (int i = 0; i < board_.size(); i++) {
				if (board_.get(i).getRegister().equals(name)) {
					System.out.println(board_.get(i));
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

		if (board_.size() > 0) {
			for (int i = 0; i < board_.size(); i++) {
				if (board_.get(i).getRegister().equals(register)) {
					if (board_.get(i).getPw().equals(pw)) {
						writeArticle(sc);
					}
				}
			}
		} else {
			System.out.println("등록된 게시글이 없습니다.");
		}
	}
}
