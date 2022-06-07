package com.arrayex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Scoreimpl implements Score {
	List<ScoreVO> list = new ArrayList<>();
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
//		name = sc.next();
//		vo.setName(name);
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

	}

	@Override
	public void delete() {

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
		System.out.println("이름을 입력해주세요.");
		for (ScoreVO vo : list) {
			if (vo.getName().equals(sc.next())) {
				System.out.println(vo);
			} else {
				System.out.println("없다능");
			}
		}
	}

	@Override
	public void searchHak() {
		System.out.println("학번을 입력해주세요.");
		for (ScoreVO temp : list) {
			if (temp.getHak().equals(sc.next())) {
				System.out.println(temp);
			} else {
				System.out.println("없다능");
			}
		}
	}
}
