package com.mapex.mscore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ScoreImpl implements Score {
	private Map<String, ScoreVO> map;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public ScoreImpl() {
		map = new HashMap<String, ScoreVO>();

	}

	// �Էµ� ���� �´� 1, ���� ����, ���� 0, Ʋ���� -1
	@Override
	public int Insert() throws IOException {
		String hak;
		System.out.print("�й� �Է�: ");
		hak = br.readLine();
		if (map.containsKey(hak)) {
			System.out.println("�̹� �����ϴ� �й��Դϴ�.");
			return 0;
		}

		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("�̸� �Է�: ");
		vo.setName(br.readLine());
		System.out.print("���� ���� �Է�: ");
		vo.setKor(Integer.parseInt(br.readLine()));
		System.out.print("���� ���� �Է�: ");
		vo.setEng(Integer.parseInt(br.readLine()));
		System.out.print("���� �Է�: ");
		vo.setMat(Integer.parseInt(br.readLine()));

		map.put(hak, vo); // �ʿ� �߰��� ��

		return 1;
	}

	@Override
	public int Update() throws IOException {
		String hak;
		System.out.print("������ �й� �Է�: ");
		hak = br.readLine();
		if (!map.containsKey(hak)) {
			System.out.println("�������� �ʴ� �й��Դϴ�.");
			return 0;
		}

		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("�̸� �Է�: ");
		vo.setName(br.readLine());
		System.out.print("���� ���� �Է�: ");
		vo.setKor(Integer.parseInt(br.readLine()));
		System.out.print("���� ���� �Է�: ");
		vo.setEng(Integer.parseInt(br.readLine()));
		System.out.print("���� �Է�: ");
		vo.setMat(Integer.parseInt(br.readLine()));

		map.put(hak, vo); // �ʿ� �߰��� ��

		return 1;
	}

	@Override
	public int Search() throws IOException {

		return 0;
	}

	@Override
	public int Delete() throws IOException {

		return 0;
	}

	@Override
	public void WriteAll() {
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			ScoreVO data = map.get(key);
			System.out.println(data.toString());
		}

	}

	@Override
	public void WriteSort() {

	}

}
