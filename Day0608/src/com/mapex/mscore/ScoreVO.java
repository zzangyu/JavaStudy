package com.mapex.mscore;

public class ScoreVO {
	private String name, hak;
	private int kor, eng, mat, tot;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		tot = kor + eng + mat;
		return tot;
	}

	private ScoreVO(String name, String hak, int kor, int eng, int mat, int tot) {
		this.name = name;
		this.hak = hak;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
	}

	@Override
	public String toString() {
		String str = String.format("�̸�:%3s �й�:%7s ��������:%3d�� ��������:%3d�� ��������:%3d�� ����:%3d�� ���:%5.1f��", name, hak, kor, eng,
				mat, getTot(), (float) getTot() / 3);
		return str;
	}

}
