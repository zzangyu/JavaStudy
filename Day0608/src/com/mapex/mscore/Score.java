package com.mapex.mscore;

import java.io.IOException;

public interface Score {
	// 추가, 수정, 검색, 삭제, 전체출력(학번순), 전체출력(정렬)

	public int Insert() throws IOException;

	public int Update() throws IOException;

	public void Search() throws IOException;

	public int Delete() throws IOException;

	public void WriteAll();

	public void WriteSort();

}
