package com.boardex;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {
	// 모든 구현은 여기
	ArrayList<BoardVO> boardList;

	public BoardSVC() {
		boardList = new ArrayList<BoardVO>();
	}

	// 글 쓰기
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

		BoardVO boardVO = new BoardVO(register, subject, email, content, pw);
		// 리스트에 추가
		addArticle(boardVO);
	}

	// 글을 리스트에 추가
	private void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}

	// 목록 보기
	public void listArticle(Scanner sc) {
		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				System.out.println(boardList.get(i));
			}
		} else {
			System.out.println("등록된 게시글이 없습니다.");
		}
	}

	// 글 삭제
	public void deleteArticle(Scanner sc) {
		System.out.println("게시글을 제거할 때는 글의 작성자와 비밀번호를 입력하세요.");
		System.out.print("작성자: ");
		String register = sc.next();
		System.out.print("비밀번호: ");
		String pw = sc.next();

		deleteArticle(register, pw);

	}

	private void deleteArticle(String register, String pw) {
		// 삭제 기능 구현
		if (boardList.size() > 0) {
			int index = -1;

			for (int i = 0; i < boardList.size(); i++) {
				if (boardList.get(i).getRegister().equals(register)) {
					if (boardList.get(i).getPw().equals(pw)) {
						boardList.remove(boardList.get(i));
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
		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				if (boardList.get(i).getRegister().equals(name)) {
					System.out.println(boardList.get(i));
				}
			}
		} else {
			System.out.println("등록된 게시글이 없습니다.");
		}
	}

	public void updateArticle(Scanner sc) {
		System.out.println("이름과 비밀번호를 입력해주세요.");
		System.out.println("이름: ");
		String register = sc.next();
		System.out.println("비밀번호: ");
		String pw = sc.next();
		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				if (boardList.get(i).getRegister().equals(register)) {
					if (boardList.get(i).getPw().equals(pw)) {

					}
				}
			}
		} else {
			System.out.println("등록된 게시글이 없습니다.");
		}
	}

}