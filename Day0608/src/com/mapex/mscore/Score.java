package com.mapex.mscore;

import java.io.IOException;

public interface Score {
	// �߰�, ����, �˻�, ����, ��ü���(�й���), ��ü���(����)

	public int Insert() throws IOException;

	public int Update() throws IOException;

	public void Search() throws IOException;

	public int Delete() throws IOException;

	public void WriteAll();

	public void WriteSort();

}
