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
			return 1; // 오름차순
		} else if (n < 1) {
			return -1; // 내림차순
		} else {
			return 0; // 같다
		}

	}
}

public class ScoreImpl implements Score {
	private Map<String, ScoreVO> map;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public ScoreImpl() {
		map = new HashMap<String, ScoreVO>();

	}

	// 입력된 값이 맞다 1, 값이 없다, 실패 0, 틀리다 -1
	@Override
	public int Insert() throws IOException {
		String hak;
		System.out.print("학번 입력: ");
		hak = br.readLine();
		if (map.containsKey(hak)) {
			System.out.println("이미 존재하는 학번입니다.");
			return 0;
		}

		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("이름 입력: ");
		vo.setName(br.readLine());
		System.out.print("국어 점수 입력: ");
		vo.setKor(Integer.parseInt(br.readLine()));
		System.out.print("영어 점수 입력: ");
		vo.setEng(Integer.parseInt(br.readLine()));
		System.out.print("수학 입력: ");
		vo.setMat(Integer.parseInt(br.readLine()));

		map.put(hak, vo); // 맵에 추가한 것

		return 1;
	}

	@Override
	public int Update() throws IOException {
		String hak;
		System.out.print("수정할 학번 입력: ");
		hak = br.readLine();
		if (!map.containsKey(hak)) {
			System.out.println("존재하지 않는 학번입니다.");
			return 0;
		}

		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("이름 입력: ");
		vo.setName(br.readLine());
		System.out.print("국어 점수 입력: ");
		vo.setKor(Integer.parseInt(br.readLine()));
		System.out.print("영어 점수 입력: ");
		vo.setEng(Integer.parseInt(br.readLine()));
		System.out.print("수학 입력: ");
		vo.setMat(Integer.parseInt(br.readLine()));

		map.put(hak, vo); // 맵에 추가한 것

		return 1;
	}

	@Override
	public void Search() throws IOException {
//		String name;
//		System.out.print("검색할 이름 입력: ");
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
		System.out.print("검색할 학번 입력: ");
		hak = br.readLine();

		if (map.containsKey(hak)) {
			System.out.println(map.get(hak).toString());
		}

	}

	@Override
	public int Delete() throws IOException {
		String hak;
		System.out.print("삭제할 학번 입력: ");
		hak = br.readLine();

		if (!map.containsKey(hak)) {
			System.out.println(hak + "이라는 학번이 존재하지 않습니다.");
			return 0;
		}
		map.remove(hak);
		System.out.println(hak + "이 삭제되었습니다.");
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

		// 내림차순 정렬
		Collections.sort(lists, Collections.reverseOrder(new MyComparator<ScoreVO>()));
		System.out.println("★★★★★총점순으로 정렬★★★★★");
		Iterator<ScoreVO> it2 = lists.iterator();
		while (it2.hasNext()) {
			ScoreVO data = it2.next();
			System.out.println(data.toString());
		}
		// 오름차순 정렬
		Collections.sort(lists, new MyComparator<ScoreVO>());
		System.out.println("★★★★★총점 역순으로 정렬★★★★★");
		Iterator<ScoreVO> it3 = lists.iterator();
		while (it3.hasNext()) {
			ScoreVO data = it3.next();
			System.out.println(data.toString());
		}

	}

}
