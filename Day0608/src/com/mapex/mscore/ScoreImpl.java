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
