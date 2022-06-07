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
		System.out.println("\n�ڡڡڡڡڡ��ڷ� ��ϡڡڡڡڡڡ�");
		String hak;
		System.out.print("�й� �Է�: ");
		hak = sc.next();
		ScoreVO temp = readScore(hak);
		if (temp != null) {
			System.out.println("�̹� ��ϵ� �й��Դϴ�.");
			return;
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("�̸� �Է�: ");
//		name = sc.next();
//		vo.setName(name);
		vo.setName(sc.next());
		System.out.print("������� �Է�: ");
		vo.setBirth(sc.next());
		System.out.print("���� ���� �Է�: ");
		vo.setKor(sc.nextInt());
		System.out.print("���� ���� �Է�: ");
		vo.setEng(sc.nextInt());
		System.out.print("���� ���� �Է�: ");
		vo.setMat(sc.nextInt());

		list.add(vo);
		System.out.println("�ڡڡڡڡڡڵ�� �Ϸ�ڡڡڡڡڡ�");
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
		System.out.println("�ڡڡڡڡڡ���ü ��¡ڡڡڡڡڡڡ�");
		Iterator<ScoreVO> it = list.iterator();
		while (it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo); // toString�� �������� ��µǴ°�!
		}
		System.out.println("�ڡڡڡڡڡ���� �Ϸ�ڡڡڡڡڡڡ�");
	}

	@Override
	public void searchName() {
		System.out.println("�̸��� �Է����ּ���.");
		for (ScoreVO vo : list) {
			if (vo.getName().equals(sc.next())) {
				System.out.println(vo);
			} else {
				System.out.println("���ٴ�");
			}
		}
	}

	@Override
	public void searchHak() {
		System.out.println("�й��� �Է����ּ���.");
		for (ScoreVO temp : list) {
			if (temp.getHak().equals(sc.next())) {
				System.out.println(temp);
			} else {
				System.out.println("���ٴ�");
			}
		}
	}
}
