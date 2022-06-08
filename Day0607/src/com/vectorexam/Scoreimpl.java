package com.vectorexam;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

import com.arrayex.Score;
import com.arrayex.ScoreVO;

public class Scoreimpl implements Score {
	private Vector<ScoreVO> list = new Vector<ScoreVO>();
	private Scanner sc = new Scanner(System.in);

	@Override
	public void insert() {
		System.out.println("\n★★★★★★자료 등록★★★★★★");
		String hak;
		System.out.print("학번 입력: ");
		hak = sc.next();
		ScoreVO temp = readScore(hak);
		if (temp != null) {
			System.out.println("이미 등록된 학번입니다.");
			return;
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("이름 입력: ");
//			name = sc.next();
//			vo.setName(name);
		vo.setName(sc.next());
		System.out.print("생년월일 입력: ");
		vo.setBirth(sc.next());
		System.out.print("국어 점수 입력: ");
		vo.setKor(sc.nextInt());
		System.out.print("영어 점수 입력: ");
		vo.setEng(sc.nextInt());
		System.out.print("수학 점수 입력: ");
		vo.setMat(sc.nextInt());

		list.add(vo);
		System.out.println("★★★★★★등록 완료★★★★★★");
	}

	public ScoreVO readScore(String hak) {
		ScoreVO vo = null;

		for (ScoreVO temp : list) {
			if (temp.getHak().equals(hak)) {
				vo = temp;
				break;
			}
		}
		return vo;
	}

	@Override
	public void update() {
		System.out.print("수정할 학번 입력: ");
		ScoreVO vo = readScore(sc.next());
		if (vo == null) {
			System.out.println("등록된 자료가 없습니다.");
			return;
		}
		System.out.print("이름 입력: ");
		vo.setName(sc.next());
		System.out.print("생년월일 입력: ");
		vo.setBirth(sc.next());
		System.out.print("국어 점수 입력: ");
		vo.setKor(sc.nextInt());
		System.out.print("영어 점수 입력: ");
		vo.setEng(sc.nextInt());
		System.out.print("수학 점수 입력: ");
		vo.setMat(sc.nextInt());

		System.out.println("★★★★★★수정 완료★★★★★★");
	}

	@Override
	public void delete() {
		System.out.println("\n자료삭제");
		System.out.println("삭제할 학번 입력: ");
		ScoreVO vo = readScore(sc.next());
		if (vo == null) {
			System.out.println("등록된 자료가 없습니다.");
			return;
		}
		list.remove(vo);
		System.out.println("★★★★★★삭제 완료★★★★★★");
	}

	@Override
	public void listAll() {
		System.out.println("★★★★★★전체 출력★★★★★★★");
		Iterator<ScoreVO> it = list.iterator();
		while (it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo); // toString을 만들어놔서 출력되는것!
		}
		System.out.println("★★★★★★출력 완료★★★★★★★");
	}

	@Override
	public void searchName() {
		System.out.println("\n이름으로 검색");
		System.out.println("검색할 이름 입력: ");
		String name;
		name = sc.next();
		for (ScoreVO scoreVO : list) {
			if (scoreVO.getName().startsWith(name)) {
				System.out.println(scoreVO);
				return;
			}

		}
		System.out.println("등록된 자료가 없습니다.");

	}

	@Override
	public void searchHak() {
		System.out.println("\n학번으로 검색");
		System.out.println("검색할 학번 입력: ");
		String hak;
		hak = sc.next();
		ScoreVO vo = readScore(hak);
		if (vo != null) {
			System.out.println(vo);
//				System.out.println(vo.getHak() + "\t");
//				System.out.println(vo.getName() + "\t");
//				System.out.println(vo.getBirth() + "\t");
//				System.out.println(vo.getKor() + "\t");
//				System.out.println(vo.getEng() + "\t");
//				System.out.println(vo.getMat() + "\t");
//				System.out.println(vo.getTot() + "\t");
//				System.out.println(vo.getTot() / 3);
			return;
		}
		System.out.println("등록된 자료가 없습니다.");
	}
}