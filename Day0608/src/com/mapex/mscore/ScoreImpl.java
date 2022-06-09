package com.mapex.mscore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class MyComparator<T> implements Comparator<T> {
	@Override
	public int compare(T o1, T o2) {
		ScoreVO s1 = (ScoreVO) o1;
		ScoreVO s2 = (ScoreVO) o2;
		int n = s1.getTot() - s2.getTot();

		if (n > 1) {
			return 1; // ��������
		} else if (n < 1) {
			return -1; // ��������
		} else {
			return 0; // ����
		}

	}
}

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
	public void Search() throws IOException {
//		String name;
//		System.out.print("�˻��� �̸� �Է�: ");
//		name = br.readLine();
//
//		Set<String> set = map.keySet();
//		Iterator<String> it = set.iterator();
//		while (it.hasNext()) {
//			String key = it.next();
//			ScoreVO data = map.get(key);
//			if (data.getName().equals(name)) {
//				System.out.println(data.toString());
//			}
//		}
//		System.out.println();

		String hak;
		System.out.print("�˻��� �й� �Է�: ");
		hak = br.readLine();

		if (map.containsKey(hak)) {
			System.out.println(map.get(hak).toString());
		}

	}

	@Override
	public int Delete() throws IOException {
		String hak;
		System.out.print("������ �й� �Է�: ");
		hak = br.readLine();

		if (!map.containsKey(hak)) {
			System.out.println(hak + "�̶�� �й��� �������� �ʽ��ϴ�.");
			return 0;
		}
		map.remove(hak);
		System.out.println(hak + "�� �����Ǿ����ϴ�.");
		return 1;
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
		List<ScoreVO> lists = new ArrayList<>();
		Set<String> set = map.keySet();
		Iterator<String> it1 = set.iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			lists.add(map.get(key));
		}

		// �������� ����
		Collections.sort(lists, Collections.reverseOrder(new MyComparator<ScoreVO>()));
		System.out.println("�ڡڡڡڡ����������� ���ġڡڡڡڡ�");
		Iterator<ScoreVO> it2 = lists.iterator();
		while (it2.hasNext()) {
			ScoreVO data = it2.next();
			System.out.println(data.toString());
		}
		// �������� ����
		Collections.sort(lists, new MyComparator<ScoreVO>());
		System.out.println("�ڡڡڡڡ����� �������� ���ġڡڡڡڡ�");
		Iterator<ScoreVO> it3 = lists.iterator();
		while (it3.hasNext()) {
			ScoreVO data = it3.next();
			System.out.println(data.toString());
		}

	}

}
