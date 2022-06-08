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
//			name = sc.next();
//			vo.setName(name);
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
		System.out.print("������ �й� �Է�: ");
		ScoreVO vo = readScore(sc.next());
		if (vo == null) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�.");
			return;
		}
		System.out.print("�̸� �Է�: ");
		vo.setName(sc.next());
		System.out.print("������� �Է�: ");
		vo.setBirth(sc.next());
		System.out.print("���� ���� �Է�: ");
		vo.setKor(sc.nextInt());
		System.out.print("���� ���� �Է�: ");
		vo.setEng(sc.nextInt());
		System.out.print("���� ���� �Է�: ");
		vo.setMat(sc.nextInt());

		System.out.println("�ڡڡڡڡڡڼ��� �Ϸ�ڡڡڡڡڡ�");
	}

	@Override
	public void delete() {
		System.out.println("\n�ڷ����");
		System.out.println("������ �й� �Է�: ");
		ScoreVO vo = readScore(sc.next());
		if (vo == null) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�.");
			return;
		}
		list.remove(vo);
		System.out.println("�ڡڡڡڡڡڻ��� �Ϸ�ڡڡڡڡڡ�");
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
		System.out.println("\n�̸����� �˻�");
		System.out.println("�˻��� �̸� �Է�: ");
		String name;
		name = sc.next();
		for (ScoreVO scoreVO : list) {
			if (scoreVO.getName().startsWith(name)) {
				System.out.println(scoreVO);
				return;
			}

		}
		System.out.println("��ϵ� �ڷᰡ �����ϴ�.");

	}

	@Override
	public void searchHak() {
		System.out.println("\n�й����� �˻�");
		System.out.println("�˻��� �й� �Է�: ");
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
		System.out.println("��ϵ� �ڷᰡ �����ϴ�.");
	}
}