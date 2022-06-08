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
		System.out.println("작성자: ");
		String register = sc.next();
		System.out.println("이메일: ");
		String email = sc.next();
		System.out.println("비밀번호: ");
		String pw = sc.next();
		System.out.println("제목: ");
		String subject = sc.next();
		System.out.println("글 내용: ");
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
	public void subjectList() {

	}

	// 글 삭제
	public void deleteSubject() {

	}

}