package com.mapex.mscore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ScoreImpl implements Score {
	private Map<String, ScoreVO> map;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public ScoreImpl() {
		map = new HashMap<String, ScoreVO>();

	}

	@Override
	public int Insert() throws IOException {

		return 0;
	}

	@Override
	public int Update() throws IOException {

		return 0;
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

	}

	@Override
	public void WriteSort() {

	}

}
